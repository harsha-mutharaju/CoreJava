package io.endeavour.stocks;

import io.endeavour.stocks.dao.LookupDAO;
import io.endeavour.stocks.dao.StockFundamentalsDAO;
import io.endeavour.stocks.dao.TotalMarketStocksDAO;
import io.endeavour.stocks.service.MarketAnalyticsService;
import io.endeavour.stocks.vo.SectorLookupVO;
import io.endeavour.stocks.vo.StockFundamentalsVO;
import io.endeavour.stocks.vo.TotalMarketStocksVO;

import java.sql.SQLException;
import java.util.List;



public class StockAnalyticsApp {

    public static void getTopStocks(MarketAnalyticsService marketAnalyticsService) throws SQLException {
        List<StockFundamentalsVO> stockFundamentalsVOList = marketAnalyticsService.getStockFundamentalsVOs();
        for (StockFundamentalsVO stockFundamentalsVO : stockFundamentalsVOList) {
            System.out.println(stockFundamentalsVO);
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        LookupDAO lookupDAO = new LookupDAO();
        TotalMarketStocksDAO totalMarketStocksDAO = new TotalMarketStocksDAO();
        StockFundamentalsDAO stockFundamentalsDAO = new StockFundamentalsDAO();

        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService(lookupDAO , totalMarketStocksDAO , stockFundamentalsDAO);


        System.out.println("----- SectorLookup ------");
        List<SectorLookupVO> sectorLookupVOList = marketAnalyticsService.getSectorLookupVOs();
        for(SectorLookupVO sectorLookupVO : sectorLookupVOList){
            System.out.println(sectorLookupVO);
        }

        System.out.println("----- TotalMarketStocks ------");
        List<TotalMarketStocksVO> totalMarketStocksVOList = marketAnalyticsService.getTotalMarketStocksVOs();
        for(TotalMarketStocksVO totalMarketStocksVO : totalMarketStocksVOList){
            System.out.println(totalMarketStocksVO);
        }

        System.out.println("----- StockFundamentals ------");
        getTopStocks(marketAnalyticsService);

        }


    }

