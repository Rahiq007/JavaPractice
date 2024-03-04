//Author: Rahiq Majeed
//Abstract: This code helps to solve a three sum problem(Index of 3 variables sum upto a target)
//Difficulty: Medium

import java.util.ArrayList;
import java.util.Scanner;

public class ThreeSum {

    public static void main(String[] args) {


        int numEle;
        int target;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter target: ");
        target = scanner.nextInt();

          System.out.print("How many numbers in arraylist? ");
          numEle = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>(numEle);

        System.out.print("Enter arraylist: ");
        for (int i = 0; i <numEle ; i++) {
            arrayList.add(scanner.nextInt());
        }

        System.out.print("ARRAY LIST IS: ");

        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.print(arrayList.get(i) + " ");
        }

        System.out.println();

        boolean found = false;

        for (int i = 0; i <arrayList.size() ; i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                for (int k = i + 2; k <arrayList.size() ; k++) {
                    if (arrayList.get(i) + arrayList.get(j) + arrayList.get(k)== target){
                        System.out.println("Combination of three sum is: " + i + ", " + j + ", " + k);
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if(!found){
            System.out.println("NO COMBINATIONS");
        }
    }
}
