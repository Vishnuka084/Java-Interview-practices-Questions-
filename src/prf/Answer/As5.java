package src.prf.Answer;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 11/19/2023
 * @project : Interview
 */
public class As5 {
    public static void main(String[] args) {
       /* oneAnswer();
        System.out.println("======02======");
        twoAnswer();
        System.out.println("======03======");
        threeAnswer();
        System.out.println("======04======");
        System.out.println("======05======");
        System.out.println("======06======");
        System.out.println("======07======");
        System.out.println("======08======");
        System.out.println("======09======");
        System.out.println("======10======");
*/

        evenNumber();


    }

    private static void evenNumber() {
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                System.out.println(i+ " ");
            }
        }
    }


/*    private static void threeAnswer() {
        for (int i = 100; i >0 ; i--) {
            System.out.println(i+ "");
        }
    }
    private static void twoAnswer() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+"");
        }
    }

    private static void oneAnswer() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
    }*/
}
