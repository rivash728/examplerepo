import java.util.Scanner;

public class Dicejack {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();


        
        System.out.println("Please enter 3 numbers between 1 and 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("NUMBERS CANNOT BE LESS THAN ONE!");
            System.exit(0);
        }

        if(num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("NUMBERS CANNOT BE MORE THAN SIX!");
            System.exit(0);
        }

        int sumOfNumbers = num1 + num2 + num3;
        int computerSum = roll1 + roll2 + roll3;

        System.out.println("Computer Sum: " + computerSum + "\nPlayer Sum: " + sumOfNumbers + "." );
        checkWin(sumOfNumbers, computerSum);

        scan.close();



        
    }

    public static int rollDice(){
        double randomNum = Math.random() * 6;
        randomNum += 1;
        return (int) randomNum;
    }

    public static void checkWin(int sumOfNumbers, int computerSum){
        if(sumOfNumbers > computerSum && sumOfNumbers - computerSum < 3){
            System.out.println("Congrats! You won!");
        } else {
            System.out.println("Sorry! You lose!");
        }
        
    }
    
}
