//Author: Rahiq Majeed
//Abstract: This code helps to solve a two sum question (addition of two index of an array to a given target)
//Difficulty: Easy
import java.util.ArrayList;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        int target;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter target: ");
        target = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.print("Enter arraylist: ");
        for (int i = 0; i <=target ; i++) {
            arrayList.add(scanner.nextInt());
        }

        System.out.print("ARRAY LIST IS: ");

        for (Integer i : arrayList){
            System.out.print(i + " ");
        }

        System.out.println();

        boolean found = false;

        for (int i = 0; i <arrayList.size() ; i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                    if (arrayList.get(i) + arrayList.get(j) == target){
                        System.out.println("Combination of two sum is: " + i + ", " + j);
                        found = true;
                        break;
                    }
            }
            if (found){
                break;
            }
        }

        if(!found){
            System.out.println("NO COMBINATIONS");
        }
    }
}
