public class Weather {
    
    public static void main(String[] Args){

        double noon = 77;
        double evening = 61;
        double midnight = 55;

        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);

    }

    // Remember! That a function that handle computation
    // should only return the result and not handle it.
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    public static void printTemperatures(double fahrenheit){

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));
    }
}
