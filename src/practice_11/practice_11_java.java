package practice_11;

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.Spliterator;

public class practice_11_java {
    public static void main(String[] args) {
        FirstTaskTester.main(args);

        SortingStudentsByGPA task_2 = new SortingStudentsByGPA();
        SortingStudentsMergeSort task_3 = new SortingStudentsMergeSort();
    }
}

interface Comparable {
    int compareTo(Comparable object);
    int getTotal();
}

class Student implements Comparable{
    private int total_score;
    Student(int total_score) {
        this.total_score = total_score;
    }
    @Override
    public int compareTo(Comparable comp_student) {
        return Integer.compare(this.total_score, comp_student.getTotal());
    }

    @Override
    public int getTotal() {
        return this.total_score;
    }
}

//task 1
class FirstTaskTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int length = scanner.nextInt();

        Student[] iDNumber = new Student[length];
        for (int i = 0; i < iDNumber.length; i++) {
            iDNumber[i] = new Student(rand.nextInt(100));
        }

        Sorting.insertionSort(iDNumber);
        Sorting.printArr(iDNumber);
    }
}


//task 1
class Sorting {
    public static void insertionSort(Comparable[] list) {
        for (int left = 0; left < list.length; left++) {
            // Вытаскиваем значение элемента
            // Перемещаемся по элементам, которые перед вытащенным элементом
            // Если вытащили значение меньшее — передвигаем больший элемент дальше
            // Если вытащенный элемент больше — останавливаемся
            // В освободившееся место вставляем вытащенное значение
            Comparable value = list[left];

            int i = left - 1;
            for (; i >= 0; i--) {

                if (value.compareTo(list[i]) < 0) {
                    list[i + 1] = list[i];
                } else {

                    break;
                }
            }

            list[i + 1] = value;
        }
    }

    public static void printArr(Comparable[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + list[i].getTotal());
        }
    }
}

//task 2
class SortingStudentsByGPA implements Comparator<Comparable>{

    SortingStudentsByGPA() {
        doLogic();
    }

    public void doLogic() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int length = scanner.nextInt();

        Student[] iDNumber = new Student[length];
        for (int i = 0; i < iDNumber.length; i++) {
            iDNumber[i] = new Student(rand.nextInt(100));
        }

        quickSort(iDNumber, 0, iDNumber.length - 1);
        Sorting.printArr(iDNumber);
    }

    public void quickSort(Comparable[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private int partition(Comparable[] arr, int begin, int end) {
        Comparable pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (compare(arr[j], pivot) <= 0) {
                i++;

                Comparable swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        Comparable swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    @Override
    public int compare(Comparable o1, Comparable o2) {
        return Integer.compare(o1.getTotal(), o2.getTotal());
    }
}

//task 3
class SortingStudentsMergeSort implements Comparator<Comparable>{
    SortingStudentsMergeSort() {
        doMainLogic();
    }

    void doMainLogic() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int length = scanner.nextInt();

        Student[] iDNumber = new Student[length];
        for (int i = 0; i < iDNumber.length; i++) {
            iDNumber[i] = new Student(rand.nextInt(100));
        }

        mergeSort(iDNumber, iDNumber.length);
        Sorting.printArr(iDNumber);
    }

    public void mergeSort(Comparable[] list, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Comparable[] l = new Comparable[mid];
        Comparable[] r = new Comparable[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = list[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = list[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(list, l, r, mid, n - mid);
    }

    private void merge(
            Comparable[] a, Comparable[] l, Comparable[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (compare(l[i], r[j]) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    @Override
    public int compare(Comparable o1, Comparable o2) {
        return Integer.compare(o1.getTotal(), o2.getTotal());
    }
}
