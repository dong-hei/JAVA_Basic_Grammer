package practice01;

public class RobotFactory {

    public static void main(String[] args) {

        Robot r1 = new Robot(0, 0, "red", "robot1"); // 생성자에 매개변수를 넘겨주며 객체 생성
        Robot r2 = new Robot(0, 0, "yellow", "robot2");
        Robot r3 = new Robot(0, 0, "blue", "robot3");
        Robot r4 = new Robot("robot4");
        Robot r5 = new Robot(144,215);

        r1.introduceMe();
        r2.introduceMe();
        r3.introduceMe();
        r4.introduceMe();
        r5.introduceMe();
//        r1.introduceMe()처럼 객체명.메소드로 생성된 객체의 메소드에 접근 할 수 있다.
    }
}
