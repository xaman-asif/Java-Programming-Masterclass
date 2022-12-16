package Concurrency_in_Java.Runnable_and_Thread;

import static Concurrency_in_Java.Threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable Runnable implementation thread");
    }
}
