public class Tip {
    
    public static void main(String[] args) {
        
        double bill = 53.50;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        calculateTip(bill);

    }

    public static void calculateTip(double bill){
        double tip = bill * 0.15;
        System.out.println("Thank you");
        System.out.println("Your service was wonderful! Please, accept this tip: " + tip);
    }
}
