package Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing.autoboxing;

import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i=0; i<10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        for (int i=0; i<10; i++) {
            System.out.println(integerArrayList.get(i).intValue());
        }
    }
}

