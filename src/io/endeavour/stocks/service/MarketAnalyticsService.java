package io.endeavour.stocks.service;

import io.endeavour.stocks.dao.LookupDAO;
import io.endeavour.stocks.dao.StockFundamentalsDAO;
import io.endeavour.stocks.dao.TotalMarketStocksDAO;
import io.endeavour.stocks.sort.StockFundamentalsCurrentRatioComparator;
import io.endeavour.stocks.vo.SectorLookupVO;
import io.endeavour.stocks.vo.StockFundamentalsVO;
import io.endeavour.stocks.vo.TotalMarketStocksVO;
import java.util.Collections;


import java.sql.SQLException;
import java.util.Comparator;
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
        List<SectorLookupVO> sectorLookupVOList = lookupDAO.getSectorLookupVOs();
        Collections.sort(sectorLookupVOList);

        return sectorLookupVOList;

    }

    public List<TotalMarketStocksVO> getTotalMarketStocksVOs() throws SQLException {
        return totalMarketStocksDAO.getTotalMarketStocksVOList();
    }

    public List<StockFundamentalsVO> getStockFundamentalsVOs() throws SQLException {
        List<StockFundamentalsVO> stockFundamentalsVOList = stockFundamentalsDAO.getStockFundamentalsVOList();
//        System.out.println("after sorting market cap using comparable");
//
//        // sorting by comparable market cap
//        Collections.sort(stockFundamentalsVOList);
//        System.out.println(stockFundamentalsVOList);
//
//        // sorting by comparator current ratio
//        Collections.sort(stockFundamentalsVOList, new StockFundamentalsCurrentRatioComparator());
//        System.out.println("after sorting current ratio using comparator");
//        System.out.println(stockFundamentalsVOList);


        // anonymous class - sorting by sectorId : inline interface implementation
        Collections.sort(stockFundamentalsVOList, new Comparator<StockFundamentalsVO>() {
            @Override
            public int compare(StockFundamentalsVO o1, StockFundamentalsVO o2) {
                if(o1.getSectorId() < o2.getSectorId()){
                    return -1;
                }
                else if(o1.getSectorId() > o2.getSectorId()){
                    return 1;
                }
                return 0;
            }
        });

        System.out.println("sorting by sector id");
        System.out.println(stockFundamentalsVOList);
        return stockFundamentalsVOList;

    }

}
