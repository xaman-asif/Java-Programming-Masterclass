package chapter15.Runnable_and_Thread;

import static chapter15.Threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable Runnable implementation thread");
    }
}
