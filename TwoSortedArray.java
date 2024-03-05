//Author: Rahiq Majeed
//Abstract: find median of two sorted arrays.
//Difficulty: Hard
import java.util.Arrays;
import java.util.Scanner;

public class TwoSortedArray {
    public static void main(String[] args) {

        int input1;
        int input2;


        Scanner scanner =  new Scanner(System.in);
        System.out.print("How manu inputs in array1: ");
        input1 = scanner.nextInt();

        int [] array1 =  new int[input1];


        for (int i = 0; i <input1 ; i++) {
            array1[i] += scanner.nextInt();
        }

        System.out.print("How many inputs in array2: ");
        input2 = scanner.nextInt();

        int [] array2 = new int[input2];

        for (int i = 0; i <input2 ; i++) {
            array2[i] += scanner.nextInt();
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int[] finalArray = new int[array1.length + array2.length];

        int count = 0;

        for (int i = 0; i <array1.length ; i++) {
           finalArray[count] = array1[i];
            count++;
        }

        for (int i = 0; i <array2.length ; i++) {
            finalArray[count] = array2[i];
            count++;
        }

        Arrays.sort(finalArray);

        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + " ");
        }
        System.out.println("////////////");


        double median;
        if (finalArray.length % 2 ==0) {
            median = ((double)finalArray[finalArray.length/2] + (double)finalArray[finalArray.length/2 - 1])/2;
        }
        else  {
            median = finalArray[finalArray.length/2];
        }
        System.out.print("Median of Added Array is: " + median);


    }
}
