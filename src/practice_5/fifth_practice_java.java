package practice_5;

enum taskNames {
    task1,
    task2,
    task3,
    task4,
    task5
}

//practice 5
public class fifth_practice_java {
    public static void main(String[] args) {
        Tester task_4_test = new Tester(taskNames.task4);
        Tester task_5_test = new Tester(taskNames.task5);
    }
}

//1 task

/*abstract class Shape {}
class shapeSon extends  practice_3.Shape {}
class shapeSon1 extends  practice_3.Shape {}*/

//2 task
abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract String getColor();

    public abstract void setColor (String color);

    public abstract boolean isFilled();
    public abstract void setFilled(boolean filled);

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}

class Circle extends Shape {
    protected double radius;
    public Circle() {}

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Circle(double radius) {this.radius = radius;}
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 2.14 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Square extends Rectangle {
    protected double side;
    Square() {}
    Square(double side) {this.side = side;}
    Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }


    @Override
    public String toString() {
        return "pracitce_3.Square{" +
                "side=" + side +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

//task 3

class Tester {
    Tester(taskNames taskName) {
        switch (taskName) {
            case task1 -> {
                System.out.println("There is nothing to test in this task");
            }
            case task2 -> {
                Tester test = new Tester(taskNames.task3);
            }
            case task3 -> {
                Shape s1 = new Circle(5.5, "RED", false); // Upcast pracitce_3.Circle to pracitce_3.Shape
                System.out.println(s1); // which version?
                System.out.println(s1.getArea()); // which version?
                System.out.println(s1.getPerimeter()); // which version?
                System.out.println(s1.getColor());
                System.out.println(s1.isFilled());
                //System.out.println(s1.getRadius()); //s1 - объект класса Shape -> не имеет метода getRadius
                Circle c1 = (Circle)s1; // downcast back to pracitce_3.Circle
                System.out.println(c1);
                System.out.println(c1.getArea());
                System.out.println(c1.getPerimeter());
                System.out.println(c1.getColor());
                System.out.println(c1.isFilled());
                System.out.println(c1.getRadius());
                //Shape s2 = new Shape(); //Создание объектов абстрактного класса невозможно
                Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // upcast
                System.out.println(s3);
                System.out.println(s3.getArea());
                System.out.println(s3.getPerimeter());
                System.out.println(s3.getColor());
                //System.out.println(s3.getLength()); //s3 - объект класса Shape -> не имеет метода getLegth
                Rectangle r1 = (Rectangle)s3; // downcast
                System.out.println(r1);
                System.out.println(r1.getArea());
                System.out.println(r1.getColor());
                System.out.println(r1.getLength());
                Shape s4 = new Square(6.6); // Upcast
                System.out.println(s4);
                System.out.println(s4.getArea());
                System.out.println(s4.getColor());
                //System.out.println(s4.getSide()); //s4 - объект класса Shape -> не имеет метода getSide

                Rectangle r2 = (Rectangle)s4;
                System.out.println(r2);
                System.out.println(r2.getArea());
                System.out.println(r2.getColor());
                //System.out.println(r2.getSide()); //getSide - метод класса Square, а мы привели к классу Rectangle
                System.out.println(r2.getLength());

                Square sq1 = (Square)r2;
                System.out.println(sq1);
                System.out.println(sq1.getArea());
                System.out.println(sq1.getColor());
                System.out.println(sq1.getSide());
                System.out.println(sq1.getLength());
            }
            case task4 -> {
                MovablePoint point_1 = new MovablePoint(1, 1, 15, 20);
                MovablePoint point_2 = new MovablePoint(2, 2, 15, 20);
                System.out.println(point_1.toString());
                System.out.println(point_2.toString());
                point_1.moveDown();
                point_2.moveUp();
                System.out.println(point_1.toString());
                System.out.println(point_2.toString());

                MovableCircle circle = new MovableCircle(0, 0, 10, 10, 15);
                System.out.println(circle.toString());
                circle.moveRight();
                System.out.println(circle.toString());
            }
            case task5 -> {
                MovableRectangle rect = new MovableRectangle(0, 5, 5, 5, 10, 15);
                System.out.println(rect.toString());
                rect.moveRight();
                rect.moveDown();
                System.out.println(rect.toString());
            }
        }
    }
}

//task 4

interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "pracitce_3.MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "pracitce_3.MovableCircle{" +
                "radius=" + radius +
                ", center=" + center.toString() +
                '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}

//task 5
class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle (int x1, int y1, int x2, int y2,
                      int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "pracitce_3.MovableRectangle{" +
                "topLeft=" + topLeft.toString() +
                ", bottomRight=" + bottomRight.toString() +
                '}';
    }

    @Override
    public void moveUp() {
        if (checkSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (checkSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (checkSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (checkSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    private boolean checkSpeed() {
        return (topLeft.xSpeed == bottomRight.xSpeed
                && topLeft.ySpeed == bottomRight.ySpeed);
    }
}