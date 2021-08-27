public class Task_0_6 {
    public static void main(String[] args) {
        maximum(3, 10, 5);
    }

    public static void maximum(int firstNumber, int secondNumber, int thirdNumber) {
        if( (firstNumber > secondNumber) & (firstNumber > thirdNumber) ) {
            System.out.println(firstNumber);
        } else if ( (secondNumber > firstNumber) & (secondNumber > thirdNumber) ) {
            System.out.println(secondNumber);
        } else {
            System.out.println(thirdNumber);
        }
    }
}
