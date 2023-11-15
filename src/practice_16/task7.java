package practice_16;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String key = scanner.next();
            printDetails(key);
        } catch (java.lang.Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for: " + key;
    }
}
