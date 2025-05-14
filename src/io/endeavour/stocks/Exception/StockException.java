package io.endeavour.stocks.Exception;

public class StockException extends RuntimeException{


    public StockException() {
    }

    public StockException(String message) {
        super(message);
    }

    public StockException(String message, Throwable cause) {
        super(message, cause);
    }

    public StockException(Throwable cause) {
        super(cause);
    }



}
