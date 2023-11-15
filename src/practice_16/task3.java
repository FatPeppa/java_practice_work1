package practice_16;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            String intString = scanner.next();
            int number = Integer.parseInt(intString);
            System.out.println(2 / number);
        } catch (java.lang.Exception exception) {
            System.out.println("Number format exception");
        }
    }
}
