package practice_16;

public class task6 {
    public static void main(String[] args) {
        Exception6 e = new Exception6();
        e.main(args);
    }
}

class Exception6 {
    public static void main(String[] args) {
        Exception6 exception = new Exception6();
        try {
            exception.getDetails(null);
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        // do something with the key
    }
}
