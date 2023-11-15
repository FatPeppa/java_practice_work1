package practice_19.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String[] arr = new String[] {"a", "b"};
        List<String> l = convertToList(arr);
        System.out.println(l.toString());
    }
    public static <T> List<T> convertToList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
}