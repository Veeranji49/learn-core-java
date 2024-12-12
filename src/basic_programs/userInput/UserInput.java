package basic_programs.userInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //chatbot();
        UserInput userInput = new UserInput();
        //userInput.checkingEvenNumber();
        eligibleToVote();
    }

    public static void chatbot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello dude!");
        String hello = scanner.nextLine();
        System.out.println("How are you ?");
        String status = scanner.nextLine();
        System.out.println("Whats your name dude ?");
        String name = scanner.nextLine();
        System.out.println("Ok" + name + " " + "what's your age ?");
        int age = scanner.nextInt();
        System.out.println("Thank you for the information");

        scanner.close();
    }

    public void checkingEvenNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("It is a even number");
        } else {
            System.out.println("It is not a even number");
        }
        scanner.close();
    }

    public static void eligibleToVote(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = scanner.nextInt();
        if(age >= 18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
        scanner.close();
    }
}
