public class Task_0_7 {
    public static void main(String[] args) {
        celciusToFahrenheit(0);
        fahrenheitToCelcius(32);
    }

    public static void celciusToFahrenheit(double degreesCencius) {
        double fahrenheit = (degreesCencius * (9/5)) + 32;
        System.out.println(fahrenheit);
    }

    public static void fahrenheitToCelcius(double fahrenheit) {
        double degreesCencius = (fahrenheit - 32) * (5/9);
        System.out.println(degreesCencius);
    }
}
