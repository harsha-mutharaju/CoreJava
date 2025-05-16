package io.endeavour.stocks.sort;

import io.endeavour.stocks.vo.StockFundamentalsVO;

import java.util.Comparator;

public class StockFundamentalsCurrentRatioComparator implements Comparator<StockFundamentalsVO> {
    @Override
    public int compare(StockFundamentalsVO o1, StockFundamentalsVO o2) {
        if(o1.getCurrentRatio() < o2.getCurrentRatio())
        {
            return -1;
        }
        else if(o1.getCurrentRatio() > o2.getCurrentRatio()){
            return 1;
        }

        return 0;
    }
}
