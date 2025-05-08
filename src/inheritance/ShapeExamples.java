package inheritance;

import java.math.BigDecimal;

public class ShapeExamples {
    public static void main(String[] args) {
        Shape circle = new Circle(new BigDecimal(10));
        System.out.println("area of circle :" + circle.calculateArea());

        Shape square = new Square(new BigDecimal(10));
        System.out.println("area of square :" + square.calculateArea());

        Rectangle rectangle = new Rectangle(new BigDecimal(10), new BigDecimal(20));
        System.out.println("area of rectangle :" + rectangle.calculateArea());


        Shape[] allShapes = new Shape[]{circle, square, rectangle};
        BigDecimal totalArea = BigDecimal.ZERO;

        for(Shape shape : allShapes) {
            totalArea = totalArea.add(shape.calculateArea());
        }
        System.out.println("Total area : " + totalArea);
    }


}
