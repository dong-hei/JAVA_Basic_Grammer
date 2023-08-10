package practice13;

// 무명 클래스를 사용하지 않은 경우
//interface Robot{
//    abstract void mySituation();
//}
//class FishRobot implements RObot{
//    int depth;
//    int x,y;
//    public void mySituation(){
//        System.out.println("나의 위치 x: 100" + "y 좌표: 200");
//    }
//}

interface Robot{
    abstract void mySituation();
}
public class RobotTest{
    public static void main(String[] args) {
        Robot r1 = new Robot(){
            @Override
            public void mySituation() {
                System.out.println("나의 위치 x: 100" + "y 좌표: 200");

            }
        };

        r1.mySituation();
    }// I Robot 을 구현하는 클래스를 별도로 만들지 않고 바로 인터페이스를 구현하는 기술이다.
}
