package Concurrency_in_Java.Interrupt_and_Join;

import static Concurrency_in_Java.Threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable Runnable implementation thread");
    }
}
