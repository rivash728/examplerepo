import java.util.Scanner;

public class Chatbot{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your username?");
        String name = scan.nextLine();

        System.out.println("\nHi! " + name + " I'm Javabot. Where are you from?");
        String place = scan.nextLine();

        System.out.println("\n I hear it's beautiful at " + place + "I'm from a place called Oracle");
    }
}