package practice21;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random r1 = new Random(); //랜덤 개체 생성
        int i = r1.nextInt(45) + 1; // 정수형 난수만 다루기때문에 nextInt()를 사용한다.
        System.out.println(i);
    }
}
