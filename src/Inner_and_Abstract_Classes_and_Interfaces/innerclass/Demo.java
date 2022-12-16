package Inner_and_Abstract_Classes_and_Interfaces.innerclass;

import java.util.Scanner;

public class Demo {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I have been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
        btnPrint.setOnClickListener(new ClickListener());
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}

