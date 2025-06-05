package simplifyingmethodcalls.replaceexceptionwithtest;

public class TemperatureConverter {
    public static double convertToCelsius(double fahrenheit) {
        if (fahrenheit < -459.67) {
            return -1.0;
        }
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        var result = convertToCelsius(-500);
        if(result == -1.0){
            System.out.println("Неприпустима температура: менше абсолютного нуля");
        }
        else System.out.println(result);

    }

}
