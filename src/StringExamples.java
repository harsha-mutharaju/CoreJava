public class StringExamples {
    /**
     * this is a entry point for java program
     * @param args
     */

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
       // System.out.println(str.toLowerCase());
        System.out.println(str.charAt(0));

        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);

        System.out.println(str.hashCode());


        String javaBatch = new String("Java Batch");
        String javaBatch2 = new String("Java Batch");

        System.out.println(javaBatch.equals(javaBatch2));
        System.out.println(javaBatch == javaBatch2);

        boolean java = javaBatch.contains("Java");
        System.out.println(java);

        int index = javaBatch.indexOf("a");
        System.out.println(index);

        System.out.println("using , :");
    String tickerSymbols = "AAPL,MSFT,TSLA";
    String[] tickers = tickerSymbols.split(",");
    for (String ticker : tickers) {
        System.out.println(ticker);
    }


        System.out.println("Using | :");
    String tickerSymbols2 = "AAPL|MSFT|TSLA";
        String[] tickers2 = tickerSymbols2.split("\\|");
        for (String ticker : tickers2) {
        System.out.println(ticker);
    }
    }
}
