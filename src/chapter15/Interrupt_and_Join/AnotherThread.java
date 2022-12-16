package chapter15.Interrupt_and_Join;

import static chapter15.Threads.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");
            return;
        }
        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");
    }
}
