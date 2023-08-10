package practice15;

public class Robot15_2 {
    String name;
}

class parameterTest2{
    public static void main(String[] args) {

        Robot15_2 r = new Robot15_2();
        r.name = "마징가";
        System.out.println(r.name); //참조변수 r은 생선된 객체 주소를 가지고 있다.

        changeName(r);
        System.out.println(r.name);
        //changeName 메소드의 매개변수로 값이 저장된 주소를 넘겨주었기 때문에
        // 메소드 안에서 주소를 참조하여 값을 변경할수 있다.
    }

    static void changeName(Robot15_2 r){
        r.name = "건담";
        System.out.println(r.name);
    }
}
