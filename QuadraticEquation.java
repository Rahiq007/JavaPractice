//Author: Rahiq Majeed
//Abstract: This code helps to solve a quadratic equation.
//Difficulty: Easy
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        int a, b ,c;
        double r1 , r2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three cooeficents: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        double d = Math.sqrt((b * b - 4 * a * c));

        r1 = (-b + d) / (2 * a);

        r2 = (-b - d) / (2 * a);

        System.out.println("Roots of the equation are: " + r1 + "," + r2);
    }
}
