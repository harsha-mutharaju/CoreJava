package inheritance;


// it has only one abstract method
@FunctionalInterface
public interface Language {
    public void print(String version);
    default void test(){
        System.out.println("Default method");
    }
    static void staticMethod(){
        System.out.println("Static method");
    }
}
