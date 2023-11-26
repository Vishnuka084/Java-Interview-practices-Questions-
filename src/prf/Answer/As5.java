package src.prf.Answer;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 11/19/2023
 * @project : Interview
 */
public class As5 {
    public static void main(String[] args) {



    }
}
/* int x = 100;
        System.out.println(x);

        {
            int y = 200;
            System.out.println(x);
            System.out.println(y);
            x++;y++;
        }
        int y = 300;
        int z = 40;
        System.out.println(z);
        System.out.println(y);*/
/*
        int j = 0;
        while (j++ < 10) {
            System.out.println(j);

        }
    }

}*/
/*for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }



    }*/
/*     int x = 0;
        int y = 0;
        for (int i = 0; i < 5; i++) {
            if ((++x>2)||(++y>2)){
                x++;
            }
        }
        System.out.println(x+" "+y);
    }*/
/* Scanner sc = new Scanner(System.in);
        int r = 0;
        for (int i = 1; i <=50 ; i++) {
            System.out.println("Input number "+i+":");
            int num = sc.nextInt();
            if (num > 100){
                r ++;
            }

        }
        System.out.println("Number given greater than  100 "+r);

    }
       /* Scanner sc = new Scanner(System.in);
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);*/
/* Scanner sc = new Scanner(System.in);
        for (int num = 1; num <=100 ; num++) {
            int count=0;
            for (int i = 2; i <=num/2 ; i++) {
                if (num%i==0){
                    count++;
                    break;
                }
            }
            if (count ==0&& num!=1){
                System.out.print(num+" "+"|");
            }
        }*/
/*
        int i, j,count;

        System.out.println("Prime numbers between 1 to 100 :");
        for (i = 2; i <= 100; i++) {
            count = 0;
            for (j = i; j >= 1; j--) {
                if (i % j == 0)
                    count = count + 1;
            }
            if (count == 2)
                System.out.print("" + i + " ");
        }*/
/*
        /////////////////////=== A - Z ====/////////////////
        Scanner sc = new Scanner(System.in);
       char c;
        for (c ='A'; c<='z';++c){
            System.out.print(c+" " +"|");
        }*/
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
/*
 evenNumber();
 randomNumber();*/
/*

    private static void randomNumber() {
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rn.nextInt(100);
            System.out.println(x+ "");
        }
    }

    private static void evenNumber() {
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                System.out.println(i+ " ");
            }
        }
    }
*/
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
