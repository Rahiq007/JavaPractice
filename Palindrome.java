//Author: Rahiq Majeed
//Abstract: This code helps to find the if the word is palindrome or not
// (What is a palindrome? A palindrome is a word, sentence, verse, or even number that reads the same backward or forward.)
//Difficulty: Easy
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        String word;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        word = scanner.nextLine();

        char[] chars = word.toCharArray();
        boolean isPalindrome = true;

        int i =0;
        int j = chars.length -1;
        while (i<j){
            if (chars[i] != chars[j]) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT A PALINDROME");
        }

    }

}