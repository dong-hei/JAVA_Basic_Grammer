package practice05;

public class Robot5 {
    int x,y;
    int power;
    int price;
    String name;

    void mySituation(){
        System.out.println("부모클래스: 나의 위치는 " + x + "," +y+ "입니다.");
    }
}

class FishRobot extends Robot5 {
    int depth;
    void swim(){
        System.out.println("나의 수심은" + depth + "입니다.");
    }
}

