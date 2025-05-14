package io.endeavour.stocks.vo;

import java.util.Objects;

public class TotalMarketStocksVO {
    private String tickerSymbol;
    private String tickerName;

    public TotalMarketStocksVO(String tickerSymbol, String tickerName) {
        this.tickerSymbol = tickerSymbol;
        this.tickerName = tickerName;
    }
    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public String getTickerName() {
        return tickerName;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TotalMarketStocksVO that)) return false;
        return Objects.equals(tickerSymbol, that.tickerSymbol);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tickerSymbol);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TotalMarketStocksVO{");
        sb.append("tickerSymbol='").append(tickerSymbol).append('\'');
        sb.append(", tickerName='").append(tickerName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
