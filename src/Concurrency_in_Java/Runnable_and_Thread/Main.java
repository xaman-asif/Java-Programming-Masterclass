package Concurrency_in_Java.Runnable_and_Thread;

import static Concurrency_in_Java.Threads.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from Main main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from Main Anonymous thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from Main Anonymous Runnable implementation thread");
            }
        });

        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from Main main thread");
    }
}
