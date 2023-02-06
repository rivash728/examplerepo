import java.util.Scanner;

public class CounterTool {
    
    public static void main(String[] Args){
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Pick a number to count by: ");
        var optionCountby = scan.nextInt();

        System.out.print("Pick a number to start counting from: ");
        int optionCountstart = scan.nextInt();

        System.out.print("Pick a number to count to: ");
        int optionCountTo = scan.nextInt();

        for(int i = optionCountstart; i <= optionCountTo; i += optionCountby){
            System.out.print(i + " ");

        }

        
    }
}
