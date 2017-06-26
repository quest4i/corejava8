package ch01;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by quest4i on 2017. 6. 24..
 */
public class Excercise01 {

    public static void main(String[] args) {

        // 1. 정수를 읽어서 2진수 8진수 16진수로 출력한다.
        Scanner in = new Scanner(System.in);
        System.out.println("What is your number?");
        int number = in.nextInt();
        System.out.printf("%1$d is %2$s, %1$o, %1$X\n", number, Integer.toBinaryString(number));

        // 2. 역수를 16진 부동소수점 수로 출력한다.
        int reverse_number = new Integer(new StringBuilder(Integer.toString(number)).reverse().toString());
        System.out.printf("%1$d = %2$s.", reverse_number, Double.toHexString((double)reverse_number));
    }
}

