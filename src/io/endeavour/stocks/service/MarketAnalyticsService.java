package io.endeavour.stocks.service;

import io.endeavour.stocks.dao.LookupDAO;
import io.endeavour.stocks.dao.StockFundamentalsDAO;
import io.endeavour.stocks.dao.TotalMarketStocksDAO;
import io.endeavour.stocks.vo.SectorLookupVO;
import io.endeavour.stocks.vo.StockFundamentalsVO;
import io.endeavour.stocks.vo.TotalMarketStocksVO;

import java.sql.SQLException;
import java.util.List;

public class MarketAnalyticsService {

    private LookupDAO lookupDAO;
    private TotalMarketStocksDAO totalMarketStocksDAO;
    private StockFundamentalsDAO stockFundamentalsDAO;

    public MarketAnalyticsService(LookupDAO lookupDAO, TotalMarketStocksDAO totalMarketStocksDAO, StockFundamentalsDAO stockFundamentalsDAO) {
        this.lookupDAO = lookupDAO;
        this.totalMarketStocksDAO = totalMarketStocksDAO;
        this.stockFundamentalsDAO = stockFundamentalsDAO;
    }

    public List<SectorLookupVO> getSectorLookupVOs() throws SQLException {
        return lookupDAO.getSectorLookupVOs();

    }

    public List<TotalMarketStocksVO> getTotalMarketStocksVOs() throws SQLException {
        return totalMarketStocksDAO.getTotalMarketStocksVOList();
    }

    public List<StockFundamentalsVO> getStockFundamentalsVOs() throws SQLException {
        return stockFundamentalsDAO.getStockFundamentalsVOList(); // ✅ instance call
    }

}
