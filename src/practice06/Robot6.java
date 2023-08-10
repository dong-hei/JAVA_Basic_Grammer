package practice06;

public class Robot6 {
    int x, y ;
    void move(){
        System.out.println("로봇 움직이기");
    }
}
class FishRobot extends Robot6{
    void move(){
        System.out.println("물고기 로봇 움직이기");
    }
}
class DroneRobot extends Robot6{
    void move(){
        System.out.println("드론 로봇 움직이기");
    }
}

class ProductionRobot extends Robot6 {
    void move(){
        System.out.println("생산 로봇 움직이기");
    }
}
