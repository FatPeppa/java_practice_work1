package practice_16;

import java.util.Scanner;



public class task2 {
    public static void main(String[] args) {
        Exception2 e = new Exception2();
        e.main(args);
    }
}


class Exception2 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            String intString = scanner.next();
            int number = Integer.parseInt(intString);
            System.out.println(2 / number);
        } catch (NumberFormatException exception) {
            System.out.println("Number format exception");
        }
    }
}
