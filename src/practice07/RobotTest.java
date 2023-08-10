package practice07;

public class RobotTest {

    public static void main(String[] args) {
        DroneRobot d1 = new DroneRobot(2000000);
        FishRobot f1 = new FishRobot(4000000);
        ProductionRobot p1 = new ProductionRobot(7000000);

        Purchaser pc1 = new Purchaser();
        pc1.purchase(d1);
        pc1.purchase(f1);
        pc1.purchase(p1);

        System.out.println("남아 있는 돈: " + pc1.money);
    }

}
