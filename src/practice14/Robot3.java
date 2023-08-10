package practice14;

public class Robot3 {
    int x = 10;
    final int y = 20;

    void local_method(){
        final int a = 100;
        int b = 200; //자동으로 final이 붙는다

        class InnerClass {
            //클래스가 메소드 안에 있는 경우를 지역 클래스라고 한다.
            //메소드 안에서 사용되는 지역 변수느느 메소드가 실행이 끝나면 메모리에서 없어지는 것처럼
            //지역 클래스도 실행 후에는 자료가 없어지게 된다. 따라서 지역 클래스느느 메소드 내부 안에서만 객체화하여 사용할수 있다.
            //지역 클래스 안에서 사용되는 메
            //메소드 지역변수는 final만 사용 가능
            static  final int c = 10;
            int d = 20;

            void showMe() {
                //a=1000; final이기 때문에 지역 변수를 변경할수 없다
                //b=2000; final이기 때문에 지역 변수를 변경할수 없다
                x = 11; //Robot 클래스의변수 x는 변경가능
                d = 200;
                System.out.println(x);
                System.out.println(y);
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
            }
        }
        InnerClass ic = new InnerClass();
        ic.showMe();
    }
}
