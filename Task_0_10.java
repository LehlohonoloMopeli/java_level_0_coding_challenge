import java.util.List;
import java.util.ArrayList;

public class Task_0_10 {
    public static void main(String[] args) {
        System.out.print("Common letters: ");
        commonLetters("house", "computers");
    }

    public static void commonLetters(String firstWord, String secondWord) {

        ArrayList<String> resultList = new ArrayList<>();

        List<String> firstList = List.of(firstWord.split(""));
        List<String> secondList = List.of(secondWord.split(""));

        for( String letter: firstList ){
            if(secondList.contains(letter)){
                resultList.add(letter);
            }
        }

        String result = String.join(", ", resultList);
        System.out.println(result);
    }
}
