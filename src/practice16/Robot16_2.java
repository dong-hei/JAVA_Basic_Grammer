package practice16;

public class Robot16_2 {

    private int x = 0;
    int explainOk = 1;
    int price;
    String name;
    InnerClass il;

    Robot16_2(){
        il = new InnerClass();
    }

    class InnerClass{
        void moveAll(){
            System.out.println(explainOk);
            System.out.println(x);
        }
    }
    void moveRight(){
        x += 10;
        System.out.println(x);
        il.moveAll(); //외부 클래스에서 내부 클래스의 멤버 메소드에 접근하기위해선 내부 클래스의 객체명,메소드 형식 사용
    }
}
