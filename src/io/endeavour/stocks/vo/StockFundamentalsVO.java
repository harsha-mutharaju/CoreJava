package io.endeavour.stocks.vo;

public class StockFundamentalsVO {
    private String tickerSymbol;
    private int sectorId;
    private double marketCap;
    private double currentRatio;

    public StockFundamentalsVO(String tickerSymbol,int sectorId,   double marketCap,double currentRatio) {
        this.tickerSymbol = tickerSymbol;
        this.currentRatio = currentRatio;
        this.sectorId = sectorId;
        this.marketCap = marketCap;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public double getCurrentRatio() {
        return currentRatio;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public int getSectorId() {
        return sectorId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StockFundamentalsVO{");
        sb.append("tickerSymbol='").append(tickerSymbol).append('\'');
        sb.append(", sectorId=").append(sectorId);
        sb.append(", marketCap=").append(marketCap);
        sb.append(", currentRatio=").append(currentRatio);
        sb.append('}');
        return sb.toString();
    }

}
