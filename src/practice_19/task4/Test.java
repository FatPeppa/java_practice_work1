package practice_19.task4;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        printFiveFirstElements(list);
    }

    public static void printFiveFirstElements(List<?> list) {
        for (int i = 0; i < 5; ++i) {
            System.out.println(list.get(i));
        }
    }
}
