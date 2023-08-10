package practice15;

public class Robot15 {
    //기본형을 매개변수로 사용하는 경우에  값만 넘겨주고 넘겨준 값이 변하지는 않는다.
    int price;
    String name;
}

class parameterTest{
    public static void main(String[] args) {
        Robot15 r1 = new Robot15(); //로봇 객체 r을 생성하고 price,name을 출력하였다.
//        이 상태에서 Robot 클래스의 객체를 생성하면 디폴트로 int 형 숫자는 0으로 참조형 변수는 null로 초기화 된다.
        System.out.println("로봇 가격:" + r1.price);
        System.out.println("로봇이름:" + r1.name);


        changePrice(r1.price);
        changeName(r1.name); //값을 변경한다.

        System.out.println(r1.price);
        System.out.println(r1.name); //메소드 호출을 끝내고 다시 기본형 매개변수는 잔달되는 값이 바뀌지 않는 것을 확인 할수있다.
    }
    static void changePrice(int price){
        price = 2000;
        System.out.println(price);
    }
    static void changeName(String r){
        r = "이순신";
        System.out.println(r);
    }
}
