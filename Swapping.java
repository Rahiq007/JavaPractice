//Author: Rahiq Majeed
//Abstract: Swap two numbers without using third variable
//Difficulty: Easy
public class Swapping {

    //Swapping 2 numbers without using 3rd variable.

    public static void main(String [] args){
        int a = 10;
        int b = 15;

        System.out.println("Original Numbers: " + a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped numbers are: " + a + " " + b);
    }
}
