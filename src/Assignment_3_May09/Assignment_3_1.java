package Assignment_3_May09;

//Write a Java program that uses List to store Person(id, name and age) objects
//Allow the user to input id, name and age.
//Support searching for a person by id and display the name and age.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Assignment_3_1 {
    private String name;
    private int age;
    private int id;

    public Assignment_3_1(int id , String name , int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void displayDetails(int id){
        System.out.println(" ID: " + id +"\tName: " + name + "\t Age: " + age);
    }

    public static void main(String[] args) {
        List<Assignment_3_1> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons to add :");
        int number = sc.nextInt();
        for(int i=0;i<number;i++){
            System.out.println("Enter person name and age( ID will be auto generated ) :");
            list.add(new Assignment_3_1(i+1 , sc.next() , sc.nextInt()));
        }
        System.out.println("Displaying list of persons :");
        for(Assignment_3_1 item : list){
            item.displayDetails(item.getId());
        }
        System.out.println("Do you want to search a person by ID? \n1.Yes \n2.No");
        int choice = sc.nextInt();
        if(choice == 1){
            boolean search = true;
            while(search){
                System.out.println("Enter person ID to search :");
                int id = sc.nextInt();
                sc.nextLine();
                boolean found = false;
                for(Assignment_3_1 i : list) {
                    if (i.getId() == id) {
                        i.displayDetails(i.getId());
                        found = true;
                        break;
                    }
                }
                if(!found){
                    System.out.println("Person not found");
                }

                System.out.println("Continue searching (Y/N) :");
                String continueSearch = sc.nextLine();
                if(!continueSearch.equalsIgnoreCase("Y") ){
                    search = false;
                }
            }
        }
        else if(choice == 2){
            System.exit(0);
        }
    }
}
