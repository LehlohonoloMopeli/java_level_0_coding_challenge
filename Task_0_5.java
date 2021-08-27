public class Task_0_5 {
    public static void main(String[] args) {
        triangle(3, 4, 5);
    }

    public static void triangle(int side1, int side2, int side3) {

        double semiparameter = (side1 + side2 + side3)/2;

        double area = Math.sqrt(
            (semiparameter
                *(semiparameter - side1)
                *(semiparameter - side2)
                *(semiparameter - side3)
            )
        );
        System.out.print(area);
    }
}
