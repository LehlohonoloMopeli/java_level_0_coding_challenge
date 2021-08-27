import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Task_0_9 {
    public static void main(String[] args) {
        vowels("Umuzi");
    }

    public static void vowels(String word) {

        String result = "Vowels: ";

        String[] vowelsArray = new String[]{"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"};
        List<String> vowelList = new ArrayList<>(Arrays.asList(vowelsArray));

        List<String> wordAsList = List.of(word.split(""));

        for (String letter : wordAsList){
            if(vowelList.contains(letter)) {
                result += letter;
            }
        }
        System.out.println(result);
    }
}
