package practice14;

//    클래스안에 클래스를 넣는것이 가능하다
//    이때 밖에있는 클래스를 외보 클래스, 안에있는 클래스를 내부 클래스라고한다.
//    내부 클래스의 메소드를 이용하기 위해 외부 클래스에서 내부클래스의 객체를 생성해서 접근해야 한다. 내부 클래스는 다음과 같이 나눌수 있다.
//    일반 중첩 클래스 (= 멤버 클래스) - 내부 클래스에서는 외부클래스의 멤버에 모두 접근할수 있다. 외부 클래스에서 내부클래스의 메소드에 접근하기 위해서는 내부 클래스의 객체를 생성한 후에 접근해야 한다(내부 클래스 객체명,메소드)
//    정적 중첩 클래스 (static) - 중첩 클래스 안에 있는 메소드는 자신의 멤버와 외부 클래스의 정적멤버만을 참조할수있다.
//    지역 클래스 (local) - 메소드 내부에 만든 클래스이다. 지역 클래스 안에서 사용하는 지역변수는 final 상수만 사용할수있다.

//    1.일반 중첩 클래스(=멤버 클래스)
class Robot1{

        private int outter_member = 0;
        int x;
        int explainOk = 1;
        int price = 10000;
        InnerClass i1;

        Robot1(){
            i1 = new InnerClass();
        }
        class InnerClass{
            int inner_field = 0;

            // 에러 발생 : 외부 클래스의 변수는 메소드 안에서만 변경가능
            // price = 50000; 사용 할 수 없음

            void innerMethod(){
                // 내부 클래스의 변수 사용
                System.out.println(inner_field);

                //외부 클래스의 변수 사용
                System.out.println(explainOk);

                //외부 클래스의 private 변수 사용도 가능
                System.out.println(outter_member);

                //외부 클래스 this.외부 클래스 멤버 변수 형식으로 외부 클래스 변수 값을 변경한다.
                Robot1.this.price = 40000;

                System.out.println(price);
            }
        }

        void moveRight(){
            x += 10;
            System.out.println(x);
            i1.innerMethod();
        }
}
