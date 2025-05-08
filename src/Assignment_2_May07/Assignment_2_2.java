package Assignment_2_May07;

//2. Write a Java program to sort an array of elements using Bubble Sort"

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_2_2 {

    public int[] bubbleSort(int[] arr1){
        for(int i=0;i<arr1.length-1;i++){
            for(int j=0;j<arr1.length-i-1;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
        return arr1;
    }

    public static void main(String[] args) {

        Assignment_2_2 obj = new Assignment_2_2();
        System.out.println("Enter size of array :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements :");
        for(int i = 0; i <= arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array before sorting :" + Arrays.toString(arr));
        obj.bubbleSort(arr);
        System.out.println("array after sorting :" +Arrays.toString(arr));

    }
}
