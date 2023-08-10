package practice06;

public class MainClass {
    public static void main(String[] args) {
        FishRobot f1 = new FishRobot();
        f1.move();
        //FishRobot은 Robot 클래스를 상속 받았기에 r1 객체를 생성하게 되면 부모 클래스의 메소드와 자식 클래스의 메소드가 모두 존재하게 된다. 이때 메소드 오버라이딩을 통해 부모클래스의 메소드가 무시되고 자식 클래스의 메소드가 실행된다.
        //이를 위해 컴파일 단계에서 FishRobot의 move() 메소드가 실행되도록 컴파일된다.

        Robot6 r1 = new FishRobot();
        r1.move();
        //부모 클래스의 메소드가 실행 되도록 컴파일 된다. 하지만 메소드를 실행하면 오버라이딩한 자식 클래스의 move() 메소드가 실행된다. 이러한 과정을 동적 바인딩이라고한다. 실제 값들이 컴파일 과정에서 확정되는 것을 정적 바인딩 이라고 한다.

        ProductionRobot p1 = new ProductionRobot();
        p1.move();

        DroneRobot d1 = new DroneRobot();
        d1.move();
    }

}
