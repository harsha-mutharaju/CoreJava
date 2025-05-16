import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgrammingExample {

public static void main(String[] args) {


    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sum = 0;
    int[] divisor = new int[]{2};
    IntStream intStream = numbers.parallelStream()
            .filter(e -> e % divisor[0] == 0)
            .mapToInt(e -> e);
    //divisor[0] = 3;
    // reduces mutation when using self written code
    // nothing is executed until a terminal function is called
    int sumFP = intStream.sum();
    System.out.println(sumFP);


}
}
