public class Parameters {
    
    public static void main(String[] args) {

        //calculateArea(2.5, 3.5);
        double area = calculateArea(2.5, 3.5);

        printCalculations(2.5, 3.5, area);
        
    }

    public static double calculateArea(double length, double width){
        double area = length * width;
        return area;
    }

    public static void printCalculations(double length, double width, double area){

        System.out.println("======== CALCULATE AREA OF RECTANGLE =======");
        
        System.out.println("\tLength: " + length);
        System.out.println("\tWidth: " + width);
        System.out.println("\tThe Area: " + area);
    }
}
