public class JavaMart {
    
    public static void main(String[] args) {
        
        double wallet = 100;
        double car = 100;

        System.out.println("Can I get this car?");
        if(wallet >= car){
            System.out.println("Sure");
            wallet -= car;
        } else {
            System.out.println("Sorry! I only have " + wallet + " left");
        }

        double price = 129.99;

        System.out.println("Can I get these nike shoes?");
        if(wallet > price){
            System.out.println("Sure!");
        } else  {
            System.out.println("Sorry! I only have " + wallet + " left");
        }

    }
}
