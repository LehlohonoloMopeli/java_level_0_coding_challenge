public class Task_0_8 {
    public static void main(String[] args) {
        hoursAndHours(124);
    }

    public static void hoursAndHours(int number) {
        int hours = number/60;
        int minutes = number % 60;

        if ( (hours == 0) & (minutes == 0) ) {
            System.out.println("0 hours, 0 minutes");
        } else if (hours == 0 & minutes == 1){
            System.out.println("0 hours, 1 minute");
        } else if (hours == 0 & minutes > 1){
            System.out.println("0 hours, " + Integer.toString(minutes) + " minutes");
        } else if (hours == 1 & minutes == 0) {
            System.out.println("1 hour, 0 minutes");
        } else if (hours == 1 & minutes == 1) {
            System.out.println("1 hour, 1 minute");
        } else if (hours == 1 & minutes > 1) {
            System.out.println("1 hour, " + Integer.toString(minutes) + " minutes");
        } else if (hours > 1 & minutes == 0) {
            System.out.println(Integer.toString(hours) + " hours, 0 minutes");
        } else if (hours > 1 & minutes == 1) {
            System.out.println(Integer.toString(hours) + " hours, 1 minute"); 
        } else if (hours > 1 & minutes > 1) {
            System.out.println(Integer.toString(hours) + " hours, " + Integer.toString(minutes) + " minutes");
        }
    }
}
