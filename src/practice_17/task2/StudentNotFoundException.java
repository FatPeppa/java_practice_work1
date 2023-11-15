package practice_17.task2;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String name) {
        super("Student "+ name + " is not found!");
    }
}
