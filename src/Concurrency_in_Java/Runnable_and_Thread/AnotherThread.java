package Concurrency_in_Java.Runnable_and_Thread;

import static Concurrency_in_Java.Threads.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");
        }
        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");
    }
}
