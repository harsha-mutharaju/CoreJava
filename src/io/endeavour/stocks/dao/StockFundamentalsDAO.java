package io.endeavour.stocks.dao;

import io.endeavour.stocks.vo.StockFundamentalsVO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StockFundamentalsDAO extends BaseDAO implements AutoCloseable{

    public StockFundamentalsDAO() throws SQLException, ClassNotFoundException {
        super();
    }

    public List<StockFundamentalsVO> getStockFundamentalsVOList() throws SQLException{

        List<StockFundamentalsVO> stockFundamentalsVOList = new ArrayList<StockFundamentalsVO>();
        //TICKER_SYMBOL, SECTOR_ID, MARKET_CAP, CURRENT_RATIO
        String query = "select ticker_symbol , sector_id , market_cap , current_ratio from endeavour.stock_fundamentals ";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            String tickerSymbol = resultSet.getString("ticker_symbol");
            Integer sectorId = resultSet.getInt("sector_id");
            Double marketCap = resultSet.getDouble("market_cap");
            Double currentRatio = resultSet.getDouble("current_ratio");
            StockFundamentalsVO stockFundamentalsVO = new StockFundamentalsVO(tickerSymbol,sectorId,marketCap,currentRatio);
            stockFundamentalsVOList.add(stockFundamentalsVO);
        }
        return stockFundamentalsVOList;
    }

    @Override
    public void close() throws Exception {
        this.connection.close();
    }
}
