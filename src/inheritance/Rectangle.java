package inheritance;

import java.math.BigDecimal;

public class Rectangle implements Shape{
    private BigDecimal length;
    private BigDecimal width;

    public Rectangle(BigDecimal length, BigDecimal width) {
        this.length = length;
        this.width = width;

    }
    public BigDecimal calculateArea() {
        return length.multiply(width);
    }
}
