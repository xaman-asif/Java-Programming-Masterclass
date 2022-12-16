package chapter15.Interrupt_and_Join;

import static chapter15.Threads.ThreadColor.*;

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
                try {
                    anotherThread.join();
                    System.out.println("AnotherThread terminated, so I am running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        });

        myRunnableThread.start();
        //anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from Main main thread");
    }
}
