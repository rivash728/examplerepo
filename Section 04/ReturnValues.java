public class ReturnValues {
    
    public static void main(String[] Args){

        double area = calculateArea(2.5, 3.5);
        double area2 = calculateArea(1.5, 5.5);
        double area3 = calculateArea(3.5, 1.5);

        String englishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");

        System.out.println(englishExplanation);
        System.out.println(frenchExplanation);
        System.out.println(spanishExplanation);


    }

    public static double calculateArea(double length, double width){
        if(length < 0 || width < 0){
            System.out.println("INVALID DIMENSIONS!!!");
            System.exit(0);
        }
        
        double area = length * width;
        return area;
    }

    public static void printCalculations(double length, double width, double area){

        System.out.println("======== CALCULATE AREA OF RECTANGLE =======");
        
        System.out.println("\tLength: " + length);
        System.out.println("\tWidth: " + width);
        System.out.println("\tThe Area: " + area);
    }

    public static String explainArea(String language){
        
        switch(language){
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "404";
        }
    }
}

// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"
