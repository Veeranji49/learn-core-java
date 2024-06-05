package Switch_Statement;

import java.util.Scanner;

public class Program_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fruit :");
        String fruit = sc.next();

        switch (fruit){

            case "Apple" :
                System.out.println("Red Apple");
                break;

            case "Mango" :
                System.out.println("Yellow Mango");
                break;

            case "Guava" :
                System.out.println("Green Guava");
                break;

            case "Banana" :
                System.out.println("Yellow Banana");
                break;

            case "Pomegranate" :
                System.out.println("Pink Pomegranate");
                break;

            case "Pine Apple" :
                System.out.println("Pine Apple Fruit");
                break;

            case "Watermelon" :
                System.out.println("Water Melon Fruit");
                break;

            case "Jack Fruit" :
                System.out.println("Jack Fruit");
                break;

            case "Kiwi" :
                System.out.println("Kiwi Fruit");
                break;

            default:
                System.out.println("Enter a valid fruit");
        }
    }
}
