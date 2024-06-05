package Switch_Statement;

import java.util.Scanner;

public class Program_3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fruit :");
        String fruit = sc.next();

        switch (fruit){

            case "Apple" -> System.out.println("Red Apple");

            case "Mango" -> System.out.println("Yellow Mango");

            case "Guava" -> System.out.println("Green Guava");

            case "Banana" -> System.out.println("Yellow Banana");

            case "Pomegranate" -> System.out.println("Pink Pomegranate");

            case "Pine Apple" -> System.out.println("Pine Apple Fruit");

            case "Watermelon" -> System.out.println("Water Melon Fruit");

            case "Jack Fruit" -> System.out.println("Jack Fruit");

            case "Kiwi" -> System.out.println("Kiwi Fruit");

            default -> System.out.println("Enter a valid fruit");
        }
    }
}
