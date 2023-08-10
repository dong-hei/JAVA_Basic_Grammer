package practice04;

public class MainClass {
    public static void main(String[] args) {
        FishRobot r1 = new FishRobot();
        r1.myName("짱가");
    }

    // 부모 클래스를 상속받으면 부모의 메소드도 사용할수 있음을 배웠다.
    //하지만 경우에 따라서 부모의 메소드 내용을 고쳐 사용할 필요가 있다.
    // 자식 클래스에서 동일한 이름의 부모 메소드를 재정의해서 사용하는 것을 오버라이딩 이라고 한다.
    //2개의 동일한 메소드가 존재하게 되면 부모 클래스의 메소드는 완전 무시되고 자식 클래스 메소드가 실행되는데 이를 메소드 오버라이딩이라고 한다.
}
