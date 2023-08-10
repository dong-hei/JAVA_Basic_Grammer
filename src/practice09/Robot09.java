package practice09;

public interface Robot09 {
    abstract void showSituation();
}
class FishRobot implements Robot09{

    int depth;
    int x,y;

    @Override
    public void showSituation() {
        System.out.println("나의 위치는 x:" + x + "y:" + y + "입니다.");
        // 반드시 추상 메소드를 구현해줘야한다.
    }

//    추상 클래스와 인터페이스의 차이점
//    추상 클래스 - 변수와 일반 메소드를 사용 가능
//    인터페이스 - 상수 이외의 변수는 사용 불가능, 추상 메소드만 사용 가능
}
