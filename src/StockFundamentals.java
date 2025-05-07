//Create class 'StockFundamental' with tickerSymbol, sectorId, subSectorId, marketCap fields.
//Make it properly encapsulated one. That means tickerSymbol, sectorId and subSectorId
// cannot be changed once a StockFundamental object is created. But other class variables - marketCap - can change.
//Make all the class variables 'private' and use getters and setters where appropriate."

public class StockFundamentals {

    private String tickerSymbol;
    private int sectorId;
    private int subSectorId;
    private double marketCap;

    public StockFundamentals(String tickerSymbol, int sectorId, int subSectorId, double marketCap) {
        this.tickerSymbol = tickerSymbol;
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
        this.marketCap = marketCap;
    }

    public String getTickerSymbol() {

        return tickerSymbol;
    }
    public int getSectorId() {

        return sectorId;
    }
    public int getSubSectorId() {

        return subSectorId;
    }
    public double getMarketCap() {

        return marketCap;
    }

    public void setMarketCap(double marketCap) {

        this.marketCap = marketCap;
    }

    public void stockFundamentalsDetails() {
        System.out.println("Ticker Symbol: " + this.getTickerSymbol());
        System.out.println("Sector Id: " + this.getSectorId());
        System.out.println("Subsector Id: " + this.getSubSectorId());
        System.out.println("Market Cap: " + this.getMarketCap());


    }
}
