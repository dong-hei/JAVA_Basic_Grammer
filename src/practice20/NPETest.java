package practice20;

class Robot20 {
    int x, y;
    int price;
}

public class NPETest {
    public static void main(String[] args) {

        Robot20 r = null;
        Robot20 r2 = new Robot20();

        System.out.println(r.price); // 생성되지 않은 객체에 접근하려하기 떄문에 r을 사용해 price 값에 접근을 하게되면 npe가 발생한다.
        System.out.println(r2.price);
    }
}
