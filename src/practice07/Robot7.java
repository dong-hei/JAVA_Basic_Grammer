package practice07;

public class Robot7 {
    int x,y;
    int price;

    Robot7(int price) {
        this.price = price;
    }

    void mySituation(){
        System.out.println("조상 클래스: 나의 위치는" + x + " , " + y + "입니다.");
    }
}

class FishRobot extends Robot7 {
    FishRobot(int price) {
        super(price);
    }

    int depth;
    void swim(){
        System.out.println("나의 수심은" + depth + "입니다.");
    }
}

class DroneRobot extends Robot7 {

    DroneRobot(int price) {
        super(price); //클래스 안에 생성자를 만들지 않으면 컴파일시 자동으로 매개변수가 없는 생성자가 만들어지는데 이를 기본생성자라고 한다.
    }

    int altitude;
    void fly(){
        System.out.println("지금 높이" + altitude + "m에 있습니다.");
    }
}

class ProductionRobot extends Robot7 {
    ProductionRobot(int price) {
        super(price);
    }

    int ProductionCount;

    void ProductionCount() {
        System.out.println("지금 생산량은" + ProductionCount+ "입니다.");
    }
}

//새로운 로봇이 만들어 질때마다 새로운 purchase 메소드를 추가로 만들어야 하는 불편함이 있지만 메소드의 매개변수에 다형성을 적용하면 하나의 메소드로 처리할수 있다.
class Purchaser{
    int money = 15000000;

    void purchase(FishRobot f) {
        money -= f.price;
    }

    void purchase(DroneRobot d) {
        money -= d.price;
    }

    void purchase(ProductionRobot p) {
        money -= p.price;
    }

}