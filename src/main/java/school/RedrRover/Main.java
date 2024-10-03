package school.RedrRover;

public class Main {

    public static String padTest(int count, String str) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += str;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("He" + padTest(5, "d") + "o world!");
    }
}
