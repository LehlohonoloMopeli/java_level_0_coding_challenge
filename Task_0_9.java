import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Task_0_9 {

    private static String[] vowelsArray = new String[]{"a", "e", "i", "o", "u"};
    private static List<String> vowelList = new ArrayList<>(Arrays.asList(vowelsArray));

    public static void main(String[] args) {
        System.out.print("Vowels: ");
        vowels("Ekard Berry");
    }

    public static void vowels(String word) {

        String input = word.toLowerCase();
        ArrayList<String> duplicateList = new ArrayList<>();
        List<String> wordAsList = splitString(input);

        for (String letter : wordAsList){
            if(vowelList.contains(letter)){
                if(!duplicateList.contains(letter)){
                    duplicateList.add(letter);
                }
            }
        }

        String result = String.join(", ", duplicateList);

        System.out.println(result);
    }

    public static List<String> splitString(String input) {
        return List.of(input.split(""));
    }
}
