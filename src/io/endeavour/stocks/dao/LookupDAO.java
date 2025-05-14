package io.endeavour.stocks.dao;

import io.endeavour.stocks.vo.SectorLookupVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LookupDAO extends BaseDAO{

    public LookupDAO() throws SQLException, ClassNotFoundException {
        super();
    }


    public List<SectorLookupVO> getSectorLookupVOs() throws SQLException {

        List<SectorLookupVO> sectorLookupVOList = new ArrayList<SectorLookupVO>();
        String query = "select sector_id , sector_name from endeavour.sector_lookup";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Integer sectorId = resultSet.getInt("sector_id");
            String sectorName = resultSet.getString("sector_name");
            SectorLookupVO sectorLookupVO = new SectorLookupVO(sectorId, sectorName);
            sectorLookupVOList.add(sectorLookupVO);
        }
        return sectorLookupVOList;
    }
}
