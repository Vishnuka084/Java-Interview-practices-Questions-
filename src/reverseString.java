package src;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 11/17/2023
 * @project : Interview
 */
public class reverseString {
    public static void main(String[] args) {

        String input   = "Vishnuka Yahan";
        String reverse = " ";
        System.out.println(input);

        for (int i = 0; i < input.length(); i++) {
            reverse = input.charAt(i) + reverse;
        }
        System.out.println(reverse);


    }
}
