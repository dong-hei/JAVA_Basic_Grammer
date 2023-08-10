package practice02;

public class Robot2 {
    int x,y;
    int power;
    int price;
    String name;
    int id;
    static int robotCount = 0; //클래스변수, 공유해서 사용할수 있는 변수

    Robot2(int power, int price, String name) {
        this.power = power;
        this.price = price;
        this.name = name;

        robotCount +=1; //JVM메소드 영역에 저장되기 떄문에 Robot클래스를 생성하지 않아도 다른 클래스에서 이용 가능하다. 로봇을 생성할때마다 number의 값이 1씩 증가한다.
        id = robotCount;
    }
}
