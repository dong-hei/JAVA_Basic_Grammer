package practice16;

public class Robot16 {
    //부모 클래스의 멤버 변수와 멤버 메소드를 이용하고 싶다면 super를 사용한다.
    int x,y;
    int price = 1000;

    Robot16(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("x: " + x + " y: " + y);
    }

    void showMe(){
        System.out.println("나는 droneRobot의 부모 클래스 입니다.");
    }
}

class droneRobot extends Robot16{
    int price = 100;

    droneRobot(int x, int y) {
        super(x, y); //부모 생성자를 호출
    }

    void showMe(){
        System.out.println("나는 자식 클래스다.");
    }

    void showPrice(){
        System.out.println("price = " + price);
        System.out.println("super.price = " + super.price);
        super.showMe();
        showMe();
    }
}
