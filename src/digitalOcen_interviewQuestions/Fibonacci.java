package src.digitalOcen_interviewQuestions;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 11/18/2023
 * @project : Interview
 */
public class Fibonacci {
    public static void main(String[] args) {
        printFibonic(10);
    }

    private static void printFibonic(int count) {

        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <=count ; i++) {
            System.out.print(a + ", ");


            a = b;
            b = c;
            c = a + b;

        }
    }
}
