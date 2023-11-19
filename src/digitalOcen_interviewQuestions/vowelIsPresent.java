package src.digitalOcen_interviewQuestions;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 11/18/2023
 * @project : Interview
 */
public class vowelIsPresent {

    public static void main(String[] args) {
        System.out.println(stringVowels("Hellos"));
        System.out.println(stringVowels("Tv"));

    }

    private static boolean stringVowels(String input) {

        return input.toLowerCase().matches(".*[aeiou].*");
    }

}
