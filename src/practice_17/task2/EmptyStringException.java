package practice_17.task2;

public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException() {
        super("An empty string was input!");
    }
}
