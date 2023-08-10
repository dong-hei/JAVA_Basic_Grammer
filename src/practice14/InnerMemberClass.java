package practice14;

public class InnerMemberClass{
    public static void main(String[] args) {
        Robot1 r1 = new Robot1();
        r1.moveRight();
    }
    // 자바에서는 클래스명과 파일명이 동일해야한다. 하나의 파일의 여러개의 class 가 가능하지만 1개의 클래스 파일에는 public 을 사용하도록 해야한다.
//    이경우 public이 붙은 클래스명이 파일명이 되어야한다. 내부클래스 예시 코드는 inner.java파일로 저장되어야 한다.
}
