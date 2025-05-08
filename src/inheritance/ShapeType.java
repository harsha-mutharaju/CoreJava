package inheritance;

public interface ShapeType {

    default void type() {
        System.out.println("Shape type");
    }
}
