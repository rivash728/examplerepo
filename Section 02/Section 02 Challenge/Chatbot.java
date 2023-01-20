import java.util.Scanner;

public class Chatbot{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your username?");
        String name = scan.nextLine();

        System.out.println("\nHi! " + name + " I'm Javabot. Where are you from?");
        String place = scan.nextLine();

        System.out.println("\n I hear it's beautiful at " + place + "I'm from a place called Oracle");
        System.out.println("How old are you?");

        int age = scan.nextInt();

        System.out.println("\nSo you are " + age + " cool! I am " + (age * 8) + " years old.");
        System.out.println("This means I'm 8 times older than you.");

        scan.nextLine();

        System.out.println("\nEnough about me. What's your favorite language? (just don't say Python");
        String language = scan.nextLine();

        System.out.println( language + ", that's great! Nice chatting with you!");
    }
}