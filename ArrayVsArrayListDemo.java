// File: ArrayVsArrayListDemo.java

import java.util.ArrayList;

public class ArrayVsArrayListDemo {

    public static void main(String[] args) {
        // Demonstrating Arrays
        // Fixed size array
        int[] intArray = new int[5];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;
        
        // Accessing array elements
        System.out.println("Array Elements:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }

        // Demonstrating ArrayList
        // Dynamic size array list
        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(10);
        intArrayList.add(20);
        intArrayList.add(30);
        intArrayList.add(40);
        intArrayList.add(50);
        
        // Adding an element to ArrayList
        intArrayList.add(60);

        // Accessing ArrayList elements
        System.out.println("ArrayList Elements:");
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println("Element at index " + i + ": " + intArrayList.get(i));
        }
        
        // Removing an element from ArrayList
        intArrayList.remove(2); // Removing element at index 2

        // Accessing ArrayList elements after removal
        System.out.println("ArrayList Elements after removal:");
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println("Element at index " + i + ": " + intArrayList.get(i));
        }
    }
}

