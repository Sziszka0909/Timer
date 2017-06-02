package pack;

/**
 * Created by sziszka on 2017.05.31..
 */
public class Timer implements Runnable {

    private static int id = 0;

    private String name;
    private int threadId;
    private int counter;

    public Timer(String name) {
        this.name = name;
        id++;
        this.threadId = id;
        this.counter = 0;
    }

    public int getThreadId() {
        return threadId;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
            try {
                while(true) {
                    Thread.sleep(1000);
                    counter++;
                }
            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName() + " stop.");
            }
    }
}
