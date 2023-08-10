package practice02;

public class StaticMethod {
//    int a = 100;
//
//    public static void main(String[] args) {
//        System.out.println(a);
//    } 스태틱 메소드도 static 변수처럼 객체 생성 없이 실행되기 때문에 static 메소드 안에 있는 인스턴스 변수나 인스턴스 메소드를 사용하면 안된다. 그 이유는 인스턴스 변수나 인스턴스 메소드는 객체 생성후에 사용할 수 있기 떄문이다.

    static int a=100;

    public static void main(String[] args) {
        System.out.println(a);
    }

    //에러를 피하기 위해서는 다음과 같이 인스턴스 변수 a를 static으로 변경해야한다.
}
