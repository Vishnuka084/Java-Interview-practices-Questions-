package src.digitalOcen_interviewQuestions;

import java.util.Scanner;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 11/17/2023
 * @project : Interview
 */
public class reverseString {
    public static void main(String[] args) {
/*
        // ------------  01 ---------------

        String input   = " Ijse Student  undergraduate";
        String reverse = " ";

        for (int i = 0; i < input.length(); i++) {
            reverse = input.charAt(i) +  reverse;

        }

        System.out.println(reverse);*/

/*        String input = "Vishnuka Yahan";
        System.out.println(input);
        StringBuilder input1 = new StringBuilder();

        input1.append(input);
        input1.reverse();

        System.out.println(input1);*/

/*        String input = "Vishnuka Yahan";
        System.out.println(input);
        StringBuilder input1 = new StringBuilder(input);

        input1.reverse();

        System.out.println(input1);*/

        Scanner scanner = new Scanner(System.in);
        String Str = scanner.nextLine();
        char[] arr = Str.toCharArray();

        String rev = "";

        for(int i = Str.length() - 1; i >= 0; i--)
        {
            rev = rev + Str.charAt(i);
        }

        System.out.println(rev);
    }
}





