package practice03;

public class RobotMain {
    public static void main(String[] args) {

        Robot3 r1 = new Robot3();

        DroneRobot d1 = new DroneRobot(10, 142, 2555);
        FishRobot f1 = new FishRobot(20, 42, 1442);

        r1.mySituation();

        d1.mySituation();
        d1.fly();

        f1.mySituation();
        f1.swim();
    }
}
