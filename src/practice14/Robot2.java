package practice14;

public class Robot2 {
    //외부 클래스 변수는 static일 경우만 내부 클래스에서 사용 가능
    static int x = 200;
    int age;

    static class InnerClass {
        int y = 300;
        static int price = 1000;

        void showMe(){
            x =100;
            System.out.println(x);
            System.out.println(y);
            System.out.println(price);
        }
//        static 내부 클래스는 외부클래스 객체 생성없이 외부 클래스명.내부 클래스 명으로 바로 객체를 생성하여 사용할 수 있다.
//        이때 주의할점은 외부 클래스 변수와 메소드가 static 일경우만 내부 클래스에서 접근하여 사용 가능하다.
    }
}

