//Author: Rahiq Majeed
//Abstract: Basic properties of cuboid using Java
//Difficulty: Easy
import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        int length, breadth, height , areaFront, areaRight, areaBottom, Area, Volume, TotalArea;

        Scanner scanner  = new Scanner(System.in);

        System.out.print("Enter length, breadth & height: ");
        length = scanner.nextInt();
        breadth = scanner.nextInt();
        height = scanner.nextInt();

        areaFront = length * height;
        areaRight = breadth * height;
        areaBottom = length * breadth;

        //logic of 2* is because of 6 sides of a cuboid
        Area = 2 * (areaFront + areaRight + areaBottom);

        System.out.println("Area: " + Area);

        Volume = length * breadth * height;

        System.out.println("Volume of the cuboid is: " + Volume);

        TotalArea = Area + Volume;

        System.out.println("Total Area of the cuboid is: " + TotalArea);

    }
}
