package Java_Collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled language");
        languages.put("Python", "an interpreted language");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code");
        languages.put("Lisp", "There lies madness");

        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the list");
        } else {
            languages.put("Java", "This program is in Java");
            System.out.println(languages.get("Java"));
        }

        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

        System.out.println("===============================================================");

        //languages.remove("Lisp");

        if (languages.remove("Algol", "an algorythmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed");
        }
        //replace function return old value before replacing with newer value
        System.out.println(languages.replace("Lisp", "a functional programming language"));
        System.out.println(languages.replace("Scala", "This doesn't exist"));
    }
}
