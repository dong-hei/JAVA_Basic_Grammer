package practice05;

public class RobotTest {
    public static void main(String[] args) {
        FishRobot f1 = new FishRobot();
        Robot5 r1 = new FishRobot();

        r1.x = 100;
        r1.y = 300;
//        r1.depth=500; 에러
        r1.mySituation();
//        r1.swim();  에러

        //참조변수 r1은 부모 클래스의 멤버만 참조할수 있는데 depth는 자식 클래스의 멤버이기 떄문이다.
        //마찬가지로 참조변수 r1은 자식 클래스에만 존재하는 swim 메소드에 접근할수 없다.
        // 그렇다면 자식 클래스의 메소드를 사용할수 없는데 부모 클래스의 참조 변수로 자식 클래스의 객체를 왜 생성하는지 의문이 든다.
        //하지만 자식 클래스가 부모 클래스의 메소드를 오버라이딩하여 사용할 경우에는 부모 클래스의 참조변수로 자식 클래스의 메소드에 접근 할 수 있다.
    }
}
