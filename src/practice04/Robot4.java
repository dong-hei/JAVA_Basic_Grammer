package practice04;

public class Robot4 {
    void myName(String name) {
        System.out.println("나의 이름: " + name);
    }
}
class FishRobot extends Robot4{
    void myName(String name) {
        System.out.println("물고기 이름: " + name);
    }
}
