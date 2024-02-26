//Author: Rahiq Majeed
//Abstract: Basic implementation of ArrayList
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        int elements;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements? ");
        elements = sc.nextInt();

        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>(elements);

        for (int i = 0; i <elements ; i++) {
            arrayList.add(sc.nextInt());
        }

        System.out.print("Elements of ArrayList are: ");

        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.print(arrayList.get(i) + " ");
        }


    }
}
