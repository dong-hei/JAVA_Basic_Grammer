package practice02;

public class RobotStatic {
    public static void main(String[] args) {
        Robot2 r1 = new Robot2(600, 100, "짱가");
        Robot2 r2 = new Robot2(1000, 500, "태권브이");
        Robot2 r3 = new Robot2(1000, 400, "마징가");
        int num = Robot2.robotCount; // 정적변수 = 클래스 변수
        System.out.println("지금까지 생성된 로봇 수 = " + num);
    }
}
