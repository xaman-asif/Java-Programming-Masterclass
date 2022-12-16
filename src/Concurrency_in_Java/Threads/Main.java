package Concurrency_in_Java.Threads;

import static Concurrency_in_Java.Threads.ThreadColor.ANSI_PURPLE;
import static Concurrency_in_Java.Threads.ThreadColor.ANSI_RED;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();
        System.out.println(ANSI_PURPLE + "Hello again from main thread");

        new Thread() {
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class thread");
            }
        }.start();
    }
}
