import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(numbers);
        System.out.println("length: " + numbers.length);

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        int[] oddNumbers = new int[]{1,2,3,6,5};

        System.out.println(Arrays.toString(oddNumbers));


        int[] squaredNumbers= new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            squaredNumbers[i] = numbers[i] * numbers[i];
        }
        System.out.println("squared numbers array");
        for(int i = 0; i < squaredNumbers.length; i++){
            System.out.println(squaredNumbers[i]);
        }



    }



}
