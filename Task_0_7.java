public class Task_0_7 {
    public static void main(String[] args) {
        System.out.println(celciusToFahrenheit(0));
        System.out.println(fahrenheitToCelcius(32));
    }

    public static double celciusToFahrenheit(double degreesCencius) {
        double fahrenheit = (degreesCencius * 9/5) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        double degreesCencius = (fahrenheit - 32) * 5/9;
        return degreesCencius;
    }
}
