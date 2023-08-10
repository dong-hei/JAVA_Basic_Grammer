package practice12;

public class Thread1 extends Thread{
//    쓰레드 클래스의 주요 생성자 및 메소드
//    Thread(Runnable r) 인터페이스 Runnable 객체를 받아 Thread 객체 생성
//    run() 쓰레드가 생성되는 부분
//    start() 쓰레드를 실행한다. 이 메소드를 사용해야 쓰레드가 작업을 시작한다.
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("ThreadOne" + i + "");
        }
    }

    public static void main(String[] args) {
        Thread1 thread = new Thread1();
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("mainTh" + i + "");
        }
    }
//    메인 스레드와 Thread1 쓰레드가 섞어 가면서 실행하는 것을 확인 할수 있다.
//    ThreadOne 쓰레드가 모두 실행될때까지 기다렸다가 메인에 있는 for 구문이 실행되는것이 아니라는것을 확인할수 있다.
}
