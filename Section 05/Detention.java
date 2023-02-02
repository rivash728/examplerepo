import java.util.Scanner;

public class Detention {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("========= DETENTION.JAVA ===========");
        System.out.println("Hi Bart! What do you want me to write?");
        String option = scan.nextLine();

        for(int i = 0; i < 100; i++){
            System.out.println(i + ". " + option);
        }
    }
}
