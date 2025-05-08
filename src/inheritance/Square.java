package inheritance;

import java.math.BigDecimal;

public class Square implements Shape{

    private BigDecimal side;

    public Square(BigDecimal side) {
        this.side = side;
    }

    public BigDecimal calculateArea() {
        return side.multiply(side);
    }


}
