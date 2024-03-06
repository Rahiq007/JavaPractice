//Author: Rahiq Majeed
//Abstract: This code helps to convert Roman numbers to Integers.
//Difficulty: Medium
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int answer = 0;
        int number = 0;

        for (int i = string.length() - 1; i >= 0; i--) {
            int value = switch (string.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
            if (value < number) {
                answer -= value;
            } else {
                answer += value;
            }

            number = value;
        }

        System.out.println(answer);
    }
}