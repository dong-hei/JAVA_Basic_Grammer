package practice12;

public class RunnableTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("ThreadOne" + i + "");
        }
    }
    
}
