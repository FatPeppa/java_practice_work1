package practice_13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//tasks 1, 3
public class task1 {
    static String file_link = "C:\\Users\\Popov\\IdeaProjects\\java_practice_work\\src\\practice_13\\practice_13_task1-2_test.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input info to write into the file. Use 'Stop!' as the end of the input.");
        String input_str;

        try {
            FileWriter writer = new FileWriter(file_link, false);
            input_str= scanner.next();
            while (!input_str.equals("Stop!")) {
                writer.write(input_str + "\n");
                input_str= scanner.next();
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
