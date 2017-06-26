package ch01;

import java.util.Random;

/**
 * Created by quest4i on 2017. 6. 24..
 */
public class Excercise02 {

    public static void main(String[] args) {
        // 정수로 된 각도를 0~359사이의 값으로 정규화한다.
        // 1. % 연산자를 이용
        // 2. floorMod 메서드를 이용

        int number = new Random().nextInt();
        number = Math.abs(number) % 360;
        System.out.println(number);
        System.out.println(Math.floorMod(number, 365));

    }
}
