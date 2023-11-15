package practice_13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class task2 {
    static String file_link = "C:\\Users\\Popov\\IdeaProjects\\java_practice_work\\src\\practice_13\\practice_13_task1-2_test.txt";

    public static void main(String[] args) {
        System.out.println("Your file info: ");

        try {
            FileReader reader = new FileReader(file_link);

            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
