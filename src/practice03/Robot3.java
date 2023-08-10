package practice03;


public class Robot3 {
    
    //접근 제어자
    //public 모두 사용가능
    //protected 다른 패키지에 있는 클래스만 사용 불가능
    //default 다른패키지,다른패키지에 있느 자식클래스만 사용 불가능
    //private 전부 사용불가능
    
    int x,y;
    void mySituation(){
        System.out.println("나의 위치 x:" + x + " , y : " + y);
    }
} // 부모클래스

class FishRobot extends Robot3{ //상속받은 자식클래스
    int depth;

    FishRobot(int x, int y, int depth) {
        this.x = x;
        this.y = y;
        this.depth = depth;
    }
    void swim(){
        System.out.println("물고기로봇 수심:" + depth + "m");
    }
}

class DroneRobot extends Robot3 { //상속받은 자식클래스
    int altitude;

    DroneRobot(int x, int y, int altitude) {
        this.x = x;
        this.y = y;
        this.altitude = altitude;
    }

    void fly(){
        System.out.println("드론로봇 높이" + altitude + "m");

    }}
