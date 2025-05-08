package inheritance;

import java.math.BigDecimal;

public class Circle implements Shape {


    private BigDecimal radius;

    public Circle(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal calculateArea() {
        return new BigDecimal(Math.PI * Math.pow(radius.doubleValue(), 2));
    }

}
