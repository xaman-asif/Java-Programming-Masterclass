package Concurrency_in_Java.Threads;

import static Concurrency_in_Java.Threads.ThreadColor.ANSI_GREEN;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_GREEN + "Hello from another thread");
    }
}
