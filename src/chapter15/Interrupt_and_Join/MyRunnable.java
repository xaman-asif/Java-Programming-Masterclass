package chapter15.Interrupt_and_Join;

import static chapter15.Threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable Runnable implementation thread");
    }
}
