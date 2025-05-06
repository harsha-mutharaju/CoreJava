import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        playWithObjects();
    }


    static void playWithObjects(){

        Stock appleStock = new Stock("Apple","AAPL");
        //appleStock.ticker_name = "Apple Stock";
        //appleStock.ticker_symbol = "AAPL";


        Stock googleStock = new Stock("Google","GOOGLE");
        //googleStock.ticker_symbol = "GOOGLE";
        //googleStock.ticker_name = "Google Stock";


        System.out.println(appleStock.ticker_symbol +"-"+appleStock.ticker_name);
        System.out.println(googleStock.ticker_symbol+"-"+googleStock.ticker_name);
        BigDecimal new1 = new BigDecimal(4.15);
        BigDecimal new2 = new BigDecimal(2.15);
        System.out.println(new1.add(new2));
    }
}



