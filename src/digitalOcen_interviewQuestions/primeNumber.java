package src.digitalOcen_interviewQuestions;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 11/18/2023
 * @project : Interview
 */
public class primeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(19));
        System.out.println(isPrime(49));
    }

    private static boolean isPrime(int n) {

        if (n == 0 || n == 1){
            return false;
        }
        if (n == 2 ){
            return false;
        }
        for (int i = 2; i <=n/2  ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
