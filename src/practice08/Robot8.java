package practice08;

public abstract class Robot8 {
    int x,y;
    int power;
    String color;
    String name;

    abstract void showSituation();
}

//추상클래스는 미완성 설계도 이기때문에 부모클래스의 역할을 하며 추상 클래스를 상속받는 자식 클래스를 만들어 미완성 메소들르 구현해서 사용해야 한다.
//앱을 제작할때 인터페이스를 구현할 때가 많다. ㅇ니터페이스를 이해하기 전 단계인 추상클래스를 이해할 필요가 있다.

class FishRobot extends Robot8 {
    int x,y;
    int depth;

    FishRobot(int x, int y, int depth) {
        this.x = x;
        this.y = y;
        this.depth = depth;

    }
    @Override
    void showSituation() {
        System.out.println("x 좌표" + x + "y 좌표" + y + "수심" + depth);
    }
}

