package practice_3;

public class third_practice_java {
    public static void main(String[] args) {
        TestBall testBall = new TestBall();
    }
}

//practice 3
class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "practice_2.Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}

class Ball {
    private double x;
    private double y;
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball () {}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString() {
        return "practice_2.Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class TestBall {
    TestBall () {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }

}