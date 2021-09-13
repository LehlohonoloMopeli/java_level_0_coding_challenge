public class Task_0_6 {
    public static void main(String[] args) {
        System.out.print(maximum(10, 10, 5));
    }

    public static int maximum(int firstNumber, int secondNumber, int thirdNumber) {
        if( (firstNumber >= secondNumber) & (firstNumber >= thirdNumber) ) {
            return firstNumber;
        } else if ( (secondNumber >= firstNumber) & (secondNumber >= thirdNumber) ) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}
