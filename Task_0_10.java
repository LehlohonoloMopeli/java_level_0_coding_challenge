import java.util.List;

public class Task_0_10 {
    public static void main(String[] args) {
        commonLetters("house", "computers");
    }

    public static void commonLetters(String firstWord, String secondWord) {

        String result = "Common letters: ";

        List<String> firstList = List.of(firstWord.split(""));
        List<String> secondList = List.of(secondWord.split(""));

        for( String letter: firstList ){
            if(secondList.contains(letter)){
                result += letter;
            }
        }
        System.out.println(result);
    }
}
