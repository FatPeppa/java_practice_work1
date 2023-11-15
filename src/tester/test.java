package tester;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 1000000; i++) {
            System.out.print(rand.nextInt(1000000) + " ");
        }
    }
}
