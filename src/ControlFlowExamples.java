public class ControlFlowExamples {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\nusing for loop\n");
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] % 2 == 0){
                System.out.println(numbers[i] + " is even");
            }
            else{
                System.out.println(numbers[i] + " is odd");
            }
        }

        System.out.println("\nusing while loop\n");
        int i=0;
        while(i<numbers.length){
            if(numbers[i] % 2 == 0){
                System.out.println(numbers[i] + " is even");
            }
            else{
                System.out.println(numbers[i] + " is odd");
            }
            ++i;

        }
        System.out.println("\nusing do while loop\n");
        int j=0;
        do {
            if(numbers[j] % 2 == 0){
                System.out.println(numbers[j] + " is even");
            }
            else{
                System.out.println(numbers[j] + " is odd");
            }
            ++j;
        }while(j<numbers.length);

        //terenary operator
        System.out.println("\nusing terinary operator\n");
        for(int k =0 ; k<10 ; k++){
            System.out.println((numbers[k] % 2 == 0) ? numbers[k] +" is even" : numbers[k]+ " is odd");
        }

    }
}
