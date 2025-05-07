import org.w3c.dom.ls.LSOutput;

public class PassByValue {
    public static void main(String[] args) {
        double sampleMarketCap = 8000;
        System.out.println("input Market cap before calling method: " + sampleMarketCap);

        Stock appleStock = new Stock("AAPL" ,"APPLE" , 8,134.123 );
        System.out.println("Market cap value of apple stock before calling method: " + appleStock.getMarketCap());

        method(sampleMarketCap,appleStock);

        System.out.println("input Market cap after calling method: " + sampleMarketCap);
        System.out.println(" market cap of apple stock after calling method :" + appleStock.getMarketCap());
    }

    public static void method(double inputMarketCap , Stock inputStock) {
        inputMarketCap = 7000;
        System.out.println("inputMarketCap from method : " + inputMarketCap);

        inputStock = new Stock("GOOGL" ,"GOOGLE INC" , 6,1323.123);

        System.out.println("market cap of input stock :" + inputStock.getMarketCap());
    }
}
