package chapter3;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 50;
        long longVar = 50000L + 10L * (byteVar + shortVar + intVar);

        System.out.println(longVar);
    }
}

