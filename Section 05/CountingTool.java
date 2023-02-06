import java.util.Scanner;

public class CountingTool {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("========== COUNTING TOOL ===========");
        System.out.println("Hello! Where do you want to count to?");
        int option = scan.nextInt();

        for(int i = 0; i <= option; i++){
            System.out.print(i + " ");
        }
    }
}
