public class WeatherNetwork {

    public static void main(String[] args) {
        int temp = 25;
        
        // All test cases approved
        temp = -1;
        temp = 0;
        temp = 10;
        temp = 11;
        temp = -12;

        String forecast = "";

        if(temp <= -1){
            forecast = "The forcast is FREEZING! Stay home!";
        }
        else if( temp <= 10){
            forecast = "The forecast is Chilly. Wear a coat!";
        } 
        else {
            forecast = "It's warm. Go outside";
        }

        System.out.println(forecast);
    }
    
}
