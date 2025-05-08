import inheritance.CheckingAccount;

import java.math.BigDecimal;

public class HelloWorld {

    public static void main(String[] input) {
        playWithPrimitives();
        playWithObjects();
    }

    static void playWithPrimitives(){
        //type and name of the variable and assigning some value
        byte b1 = 12;
        byte b2 = 14;
        int i = 20;
        int j = 300;
        int sum = i+j;

       // System.out.println(sum + " is sum ");

        float f1 = 1.07f;
        float f2 = 2.07f;
        float f3 = f1+f2;
       // System.out.println("sum of floats " + f3);

        BigDecimal bigDecimal1 = new BigDecimal("1.07");
        BigDecimal bigDecimal2 = new BigDecimal("2.07");
        BigDecimal bigDecimal3 = bigDecimal1.add(bigDecimal2);
       // System.out.println("sum of big decimals " + bigDecimal3);

        boolean isGreater = f1 > f2;
        boolean valid = false;
        System.out.println(" f1 > f2 ? "+ isGreater);

        long l1 = 1000000000000L;
        long l2 = 2000000000000L;

        long l3 = l1*l2;
       // System.out.println("Multiplying long values " + l3);

    }

    static void playWithObjects(){
        Stock appleStock = new Stock("AAPL", "Apple Stock", 3.0f);
        Stock googleStock = new Stock("GOOGL", "Google Stock", 1.5f);
        Stock newStock = new Stock("HARSHA" , "HAR");

        System.out.println("checking overriden methods of hashcode , equals and toString");
        System.out.println(newStock.toString());
        System.out.println(appleStock.toString());
        System.out.println(newStock.hashCode());
        System.out.println("end of checking ");

        System.out.println(appleStock.equals(newStock));


//        System.out.println("Apple ticker symbol : " + appleStock.getTickerSymbol());
//        System.out.println("Google ticker symbol : " + googleStock.getTickerSymbol());
//
//        System.out.println("is Apple good stock ? " + appleStock.isGoodStock());
//        System.out.println("is Google good stock ? " + googleStock.isGoodStock());

        Stock teslaStock = new Stock("TESLA", "Tesla Stock", 3.0f, 125.00);
        teslaStock.stockDetails();

        //Stock teslaStock = new Stock("TESLA", "Tesla Stock", 3.0f, 125.00);
        StockFundamentals amznStock = new StockFundamentals("AMZN" , 1 , 20 , 12345.234);
        amznStock.stockFundamentalsDetails();

        //System.out.println(CheckingAccount instanceof Account);


        System.out.println("App name " + Stock.APPLICATION_NAME);
        Stock.APPLICATION_NAME = "Other Application";
        Stock.printAppName();
        appleStock.printAppName();

    }
}
