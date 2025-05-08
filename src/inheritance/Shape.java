package inheritance;

import java.math.BigDecimal;

public interface Shape {

    BigDecimal calculateArea();

    default void print() {
        System.out.println("shape interface");
    }

}
