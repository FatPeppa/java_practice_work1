package practice_16;

public class task5 {
    public static void main(String[] args) {
        Exception exception = new Exception();
        try {
            exception.getDetails(null);
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    static class Exception {


        public void getDetails(String key) {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
        }
    }
}
