import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        System.out.println("Enter marks for 5 students");
        for(int i=0;i<5;i++){
            System.out.println("subject"+(i+1)+":");
            marks[i] = sc.nextInt();
            total+= marks[i];
        }
        double average = total/5.0;
        double percentage = (total/500.0)*100;
        char grade;
        if(percentage>=90) grade = 'A';
        else if(percentage>=80) grade = 'B';
        else if(percentage>=70) grade = 'C';
        else if(percentage>=60) grade = 'D';
        else grade='E';
        System.out.println("\n Total marks :" + total);
        System.out.println("\n Average marks :"+ average);
        System.out.println("\n percentage :"+ percentage +"%");
        System.out.println("\n Grade :"+ grade);
        sc.close();



    }

}
