//Author: Rahiq Majeed
//Abstract: Fina an Anagram
//Difficulty: Easy
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        String input1;
        String input2;

        Scanner scanner = new Scanner(System.in);

        input1 = scanner.nextLine();
        input2 = scanner.nextLine();

        char [] final_input1;
        char [] final_input2;

        final_input1 = input1.toCharArray();
        final_input2 = input2.toCharArray();

        Arrays.sort(final_input1);
        Arrays.sort(final_input2);


        boolean flag = true;

        for (int i = 0; i < final_input1.length ; i++) {
            flag = false;
            for (int j = 0; j < final_input2.length ; j++) {
                if (final_input1[i] == final_input2[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }
        if (flag) {
            System.out.println("It is an anagram");
        }
        else {
            System.out.println("Not an anagram");
        }
    }
}
