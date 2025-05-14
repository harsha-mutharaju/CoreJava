package io.endeavour.stocks.dao;

import io.endeavour.stocks.vo.SectorLookupVO;
import io.endeavour.stocks.vo.TotalMarketStocksVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TotalMarketStocksDAO extends BaseDAO{

    public TotalMarketStocksDAO() throws SQLException, ClassNotFoundException {
        super();
    }

    public List<TotalMarketStocksVO> getTotalMarketStocksVOList() throws SQLException {
        List<TotalMarketStocksVO> totalMarketStocksVOList = new ArrayList<>();
        String query = "SELECT ticker_symbol, ticker_name FROM endeavour.total_market_stocks";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String tickerSymbol = resultSet.getString("ticker_symbol");
            String tickerName = resultSet.getString("ticker_name");
            TotalMarketStocksVO totalMarketStocksVO = new TotalMarketStocksVO(tickerSymbol, tickerName);
            totalMarketStocksVOList.add(totalMarketStocksVO);
        }

        return totalMarketStocksVOList;
    }


}
