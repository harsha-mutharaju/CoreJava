import java.util.Objects;

public class Stock {

    private String tickerName;
    private String tickerSymbol;
    private float currentRatio;
    public double marketCap;

    public static String APPLICATION_NAME = "STOCK";

    public Stock(String tickerSymbol){
        this.tickerSymbol = tickerSymbol;
    }

    public Stock(String tickerSymbol, String tickerName) {
        this.tickerSymbol = tickerSymbol;
        this.tickerName = tickerName;
    }

    public Stock(String tickerSymbol, String tickerName, float currentRatio) {
        this.tickerName = tickerName;
        this.tickerSymbol = tickerSymbol;
        this.currentRatio = currentRatio;
    }

    public Stock(String tickerSymbol, String tickerName, float currentRatio,double marketCap) {
        this.tickerName = tickerName;
        this.tickerSymbol = tickerSymbol;
        this.currentRatio = currentRatio;
        this.marketCap = marketCap;
    }

    public String getTickerName() {

        return tickerName;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public float getCurrentRatio() {
        return currentRatio;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public boolean isGoodStock(){
        return this.getCurrentRatio() > 2;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "tickerName='" + tickerName + '\'' +
                ", tickerSymbol='" + tickerSymbol + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Objects.equals(tickerSymbol, stock.tickerSymbol);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tickerSymbol);
    }






    // In the Stock class, write a method to print stock details using System.out.println
    // Example:
    // Ticker Symbol: AAPL
    // Ticker Name: Apple
    // Market Cap: 2000
    // Current Ratio: 15

    public void stockDetails() {
        System.out.println("Ticker Name: " + this.getTickerName());
        System.out.println("Ticker Symbol: " + this.getTickerSymbol());
        System.out.println("Current Ratio: " + this.getCurrentRatio());
        System.out.println("Market Cap: " + this.getMarketCap());


    }

    public static void printAppName(){
        System.out.println(APPLICATION_NAME);
    }
}
