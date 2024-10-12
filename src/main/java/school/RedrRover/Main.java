package school.RedrRover;

import org.apache.commons.lang3.StringUtils;

public class Main {

    public static String padTest(int count, String str) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += str;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("He" + padTest(3, "d") + "o world!");
        String str = StringUtils.leftPad("", 5, "ttt");
        System.out.println("My" + str + " test");
    }
}
