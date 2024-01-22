package Challenge_6;

public class Converter {

    public static double convertKmInMiles (double km) {
        return km * 0.621371;
    }
    public static double convertMilesInKm (int miles) {
        return miles / 0.621371;
    }
    public static double convertMeterInFeet (int meter) {
        return meter * 3.28084;
    }
    public static double convertFeetInMeter (int feet) {
        return feet / 3.28084;
    }
    public static double convertCelsiusInFahrenheit (int celsius) {
        return celsius * 9/5 + 32 ;
    }
    public static double convertFahrenheitInCelsius (int fahrenheit) {
        return (fahrenheit - 32) * 5/9 ;
    }

    public static int operation (int num1, double num2) {
        switch (num1) {
            case 1:
                return (int) convertKmInMiles(num2);
            case 2:
                return (int) convertMilesInKm((int) num2);
            case 3:
                return (int) convertMeterInFeet((int) num2);
            case 4:
                return (int) convertFeetInMeter((int) num2);
            case 5:
                return (int) convertCelsiusInFahrenheit((int) num2);
            case 6:
                return (int) convertFahrenheitInCelsius((int) num2);
            default:
                throw new IllegalArgumentException("Unsupported operation");
        }
    }

}










