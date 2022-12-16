package Java_Tutorial_Expressions_Statements_Codeblocks_Methods_and_more;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println(newScore);
        newScore = calculateScore(20);
        System.out.println(newScore);

    }
    public  static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public  static int calculateScore(int score) {
        System.out.println("Unnamed person scored " + score + " points");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (feet > 12)) {
            return -1;
        }
        double centimeter = (feet * 12) * 2.54;
        centimeter += inches * 2.54;

        System.out.println(feet + " feet, " + inches + " inches = " + centimeter + " cm");
        return centimeter;
    }
}

