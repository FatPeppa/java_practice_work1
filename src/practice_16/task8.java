package practice_16;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            try {
                Scanner scanner = new Scanner(System.in);
                String key = scanner.next();
                printDetails(key);
                flag = false;
            } catch (java.lang.Exception ignored) {
                System.out.println("Повторная попытка: ");
            }
        }
    }

    public static void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public static String getDetails(String key) {
        if (key == null || key.equals("v")) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for: " + key;
    }
}
