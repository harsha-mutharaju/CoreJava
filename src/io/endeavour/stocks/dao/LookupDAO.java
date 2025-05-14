package io.endeavour.stocks.dao;

import io.endeavour.stocks.Exception.StockException;
import io.endeavour.stocks.vo.SectorLookupVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LookupDAO extends BaseDAO{

    public LookupDAO() throws SQLException, ClassNotFoundException {
        super();
    }


    public List<SectorLookupVO> getSectorLookupVOs() throws SQLException {
        List<SectorLookupVO> sectorLookupVOList = new ArrayList<>();
        String query = "SELECT sector_id, sector_name FROM endeavour.sector_lookup";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Integer sectorId = resultSet.getInt("sector_id");
                String sectorName = resultSet.getString("sector_name");
                SectorLookupVO sectorLookupVO = new SectorLookupVO(sectorId, sectorName);
                sectorLookupVOList.add(sectorLookupVO);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("exception in getSectorLookupVOs" + e);
            StockException stockException = new StockException("error in getSectorLookupVOs");
            throw stockException;
        }
        finally {
            System.out.println("finally for exception in getSectorLookupVOs");
        }

        return sectorLookupVOList;
    }

}
