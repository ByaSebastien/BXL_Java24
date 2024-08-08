package be.digitalcity.java.demo.demoThread;

public class MyThread extends Thread{

    private int id;

    public MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(this.id == 2){
                throw new RuntimeException();
            }
            System.out.println("Thread " + id + " : " + i + 1);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
