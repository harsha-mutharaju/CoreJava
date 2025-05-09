package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("B");
        strList.add("C");
        strList.add("D");
        strList.add("E");
        System.out.println("size of strList: " + strList.size());

        // Use wildcard method
        printList(strList);                 // works with any list
        printUpperBoundedList(strList);     // works with List<? extends String>

        // extract method refactoring
        listexampls();
    }

    private static void listexampls() {
        List<Object> strList2 = new ArrayList<>();
        strList2.add("A");
        strList2.add(8); // int will be autoboxed to Integer

        System.out.println(strList2);

        // Wildcard usage
        printList(strList2); // works with List<Object>
    }

    // Generic method that accepts any list (unbounded wildcard)
    public static void printList(List<?> list) {
        System.out.println("Printing using wildcard <?>:");
        for (Object item : list) {
            System.out.println(item);
        }
    }

    // Generic method with upper-bounded wildcard (extends)
    public static void printUpperBoundedList(List<? extends CharSequence> list) {
        System.out.println("Printing using ? extends CharSequence:");
        for (CharSequence item : list) {
            System.out.println(item);
        }
    }
}
