package practice12;

public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableTest());
        t1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("mainTh" + i + "");
        }
//        운영체제 CPU 스케쥴링에 의해 관리되기에 실행할 때마다 실행 결과는 달라진다.
    }
}
