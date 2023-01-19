import java.util.Scanner;

public class Signup {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = scan.nextLine();

        System.out.println("What is your last name?");
        String lastName = scan.nextLine();

        System.out.println("How old are you?");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Make a username!");
        String userName = scan.nextLine();

        System.out.println("What city do you live in?");
        String city = scan.nextLine();

        System.out.println("What country do you live in?");
        String country = scan.nextLine();

        System.out.println("\n\t Name: " + firstName + " " + lastName);
        System.out.println("\t Age: " + age);
        System.out.println("\t Username: " + userName);
        System.out.println("\t City: " + city);
        System.out.println("\t Country: " + country);



    }
}
