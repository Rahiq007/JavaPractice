//Author: Rahiq Majeed
//Abtract: This file contains basics of Array and how to use it.

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int elements;
        int add = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements in array? ");
        elements = sc.nextInt();

        int[] array = new int[elements];

        for (int i = 0; i < elements; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Elements of array are: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);
        System.out.println();
        System.out.print("Sorted Array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            add += array[i];
        }
        System.out.println();

        System.out.println("Addition of array is: " + add);


        System.out.print("Reverse Array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
