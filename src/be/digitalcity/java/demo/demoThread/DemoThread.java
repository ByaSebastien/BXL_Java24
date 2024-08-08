package be.digitalcity.java.demo.demoThread;

public class DemoThread {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 3; i++) {
            MyThread myThread = new MyThread(i + 1);
            myThread.start();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Hey ho");
            Thread.sleep(1000);
        }
    }
}
