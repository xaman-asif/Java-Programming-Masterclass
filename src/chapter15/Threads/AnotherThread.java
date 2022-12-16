package chapter15.Threads;

import static chapter15.Threads.ThreadColor.ANSI_GREEN;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_GREEN + "Hello from another thread");
    }
}
