package practice_10;

//practice 10
public class tenth_practice_java {
    public static void main(String[] args) {
        FirstTask task1 = new FirstTask(11);
        System.out.println();
        SecondTask task2 = new SecondTask(5);
        System.out.println();
        ThirdTask task3 = new ThirdTask(4, 7);
    }
}

//task 1 in task list
class FirstTask {
    private int n;
    private boolean isPossible = true;

    FirstTask(int n) {
        this.n = n;

        if (n <= 0) {
            isPossible = false;
        }

        doMainTaskLogic();
    }

    private void doMainTaskLogic() {
        if (!isPossible) {
            System.out.println("n must be bigger than a zero!");

            return;
        }

        recursionMethod(n);
    }

    //sum - треугольные числа. Сумма чисел для определения последнего значения
    //числа треугольные (значения), следовательно, number < сумма чисел от 1 до max значения числа в последовательности
    //можно определить макс число
    private String recursionMethod(int number) {
        int sum = 0;
        int j = 0;

        if (number == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < number; i++) {
                sum += i;
                j = i;
            }

            System.out.print(recursionMethod(--number) + " " + j);
        }

        return "";
    }
}

//task 2 in task list
class SecondTask {
    private int n;
    private boolean isPossible = true;

    SecondTask(int n) {
        this.n = n;

        if (n <= 0) {
            isPossible = false;
        }

        doMainTaskLogic();
    }

    private void doMainTaskLogic() {
        if (!isPossible) {
            System.out.println("n must be bigger than a zero!");

            return;
        }

        System.out.println(recursionMethod(n));
    }

    private String recursionMethod(int number) {
        if (number == 1) {
            return "1";
        }
        return recursionMethod(number - 1) + " " + number;
    }
}

//task 3 in task list
class ThirdTask {
    private int a, b;
    private boolean isPossible = true;

    ThirdTask(int a, int b) {
        this.a = a;
        this.b = b;

        if (a <= 0 || b <=0 || b<a) {
            isPossible = false;
        }

        doMainTaskLogic();
    }

    private void doMainTaskLogic() {
        /*if (!isPossible) {
            System.out.println("Input other parameters!");

            return;
        }*/

        System.out.println(recursionMethod(a, b));
    }

    private String recursionMethod(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            if (firstNumber == secondNumber) {
                return Integer.toString(a);
            }

            return firstNumber + " " + recursionMethod(firstNumber - 1, secondNumber);
        } else {
            if (firstNumber == secondNumber) {
                return Integer.toString(firstNumber);
            }

            return firstNumber + " " + recursionMethod(firstNumber + 1, secondNumber);
        }
    }
}
