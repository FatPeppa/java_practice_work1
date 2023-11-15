package practice_16;

public class task1 {
    public static void main(String[] args) {
        Exception exp = new Exception();
        exp.exceptionDemo1();
        //exp.exceptionDemo2();
        //exp.exceptionDemo3();
    }
}

class Exception extends Throwable {
    public void exceptionDemo1() {
        System.out.println(2 / 0);
    }

    public void exceptionDemo2() {
        System.out.println(2.0 / 0.0);
    }

    public void exceptionDemo3() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) { System.out.println("Attempted division by zero");
        }
    }
}


