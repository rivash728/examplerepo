public class AskJava {

    public static void main(String[] args) {
        
        double change = 3.50;
        double price = 2.50;

        System.out.println("Me: Hi Java, do I have enough change to buy chips?");
        System.out.println("Java: " + (change > price));

        int capacity = 12;
        int people = 15;

        System.out.println("Me: Hi Java, can this elevator hold this many people?");
        System.out.println("Java: " + (people < capacity));

        String request = "PS5";
        String purchase = "Toy car";

        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + purchase == request);

        int guests = 4;
        int maxGuests = 10;
        System.out.println("Me: Hi Java, can everyone attend my dinner party ");
        System.out.println("Java: " + (guests < maxGuests));

        int yourVotes = 23;
        int competitorVotes = 32;
        System.out.println("Me: Hi Java, will I win this election?");
        System.out.println("Java: " + (yourVotes > competitorVotes));

    }
}