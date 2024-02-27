//Author: Rahiq Majeed
//Abstract: Area of a triangle
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float side1;
        float side2;
        float side3;
        float S;
        float area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side1: ");
        side1 = scanner.nextFloat();

        System.out.print("Enter side2: ");
        side2 = scanner.nextFloat();

        System.out.print("Enter side2: ");
        side3 = scanner.nextFloat();


        S = (side1 + side2 + side3) / 2;
        area =(float) Math.sqrt( S * (S - side1) * (S - side2) * (S- side3));
        System.out.println("Area of triangle is: " + area);

    }
}
