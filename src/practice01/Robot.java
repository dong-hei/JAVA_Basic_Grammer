package practice01;

public class Robot {
//클래스란? 동작과 기능을 클래스라는 이름으로 묶어서 관리한다

    //멤버 변수 - 객체의 상태(속성)을 저장하는 변수이며 필드라고도 한다.
    int x,y;
    int power;
    String color;
    String name; //인스턴스 변수 - 클래스의 인스턴스(객체)를 생성할 때 만들어진다.

    static int totalNum; //static 변수 - 어떤 클래스나 멤버변수나 멤버메소드를 사용하기 위해서는 그 클래스의 객체를 생성한 후 객체명변수형식으로 접근을 해아한다.
    // 하지만 변수 앞에 static을 쓰면 정적 멤버,정적 메소드가 되고 이러한 멤버들은 객체 생성없이 바로 접근하여 사용할수 있다. static 변수를 사용하는 방법은 클래스명.변수이다.


    //생성자 - 멤버 변수를 초기화 하는데 사용된다.
    Robot(int x, int y, String color, String name) {
        this.x = x; // this.는 객체 자신을 의미한다. 매개변수로 들어온 값 x를 멤버변수 x에 담으려면 this.x로 사용한다.
        this.y = y;
        this.color = color;
        this.name = name;
    }

    Robot(String name) {
        this.name = name;
    }

    Robot(int x, int y) {
        this.x = x;
        this.y = x;
    } //이름,위치만 초기화 할수있는데 이러한 방법을 생성자 오버로딩이라고한다.

    // 메소드 객체의 동작(기능)을 수행한다. 메소드만 따로 사용될수는 없으며 클래스 안에서 사용된다.
    // 입력을 받아 처리 결과를 반환하는 역할을 한다(입력값이 없을 수도 있고 반환되는 처리결과 값을 얻을 수도 있다.)

    void moveForward(){
        x += 5; // x값을 5만큼 증가시키기
    }

    // void ←(텅 비어 있다) moveForward() ←(반환값이 없는 메소드)
    void moveBack(){
        x -= 5; // x값을 5만큼 감소시키기
    }

    //메소드 구조로 반환타입이 void가 아니면 반드시 return이 들어가야한다.
//    int←(반환타입) add←(메소드명) (int x, int y)←(매개변수) {
//      return x+y;
//    }

    void introduceMe(){
        System.out.println("---------------" +  name + "----------------------");
        System.out.println("나의 이름은" +  name + "입니다.");
        System.out.println("나의 색은" +  color + "입니다.");
        System.out.println("나의 x좌표값은" + x + "입니다.");
        System.out.println("나의 y좌표값은" + y + "입니다.");
        System.out.println("-------------------------------------------------");

    }
}
