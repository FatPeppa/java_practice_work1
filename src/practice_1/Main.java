package practice_1;

enum classNames {
    Dog,
    Circle1,
    Book
}

public class Main {
    public static void main(String[] args) {
        int age;
        String name;

        Tester dog_tester = new Tester(classNames.Dog);
        Tester circle_tester = new Tester(classNames.Circle1);
        Tester book_tester = new Tester(classNames.Book);
    }
}

class Tester {
    Tester(classNames test_class_name) {
        switch (test_class_name) {
            case Dog -> {
                Dog dog = new Dog("micky", 22);
                System.out.println(dog.toString());
                System.out.println(dog.getName());
                dog.addWoof();
                System.out.println(dog.toString());
                System.out.println(dog.getAge());
            }
            case Book -> {
                Book book = new Book(20);
                System.out.println(book.getAmountOfPages());
                book.setWatchingPageNumber(10);
                book.setWatchingPageText("Hello world");
                System.out.println(book.toString());
            }
            case Circle1 -> {
                Circle circle = new Circle(2, 4);
                System.out.println(circle.toString());
                Circle circle1 = new Circle(1, 1);
                circle.setRadius(circle1.getRadius());
                System.out.println(circle.toString());
                circle1.jump();
                circle1.jump();
                System.out.println(circle1.toString());
            }
        }
    }
}

class Dog{
    private int age;
    private String name;

    Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void addWoof() {
        this.name += " woof!";
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Circle {
    private int radius;
    private int weight;
    String jump_history = "";

    Circle(int radius, int weight) {
        this.radius = radius;
        this.weight = weight;
    }

    public int getRadius() {
        return radius;
    }

    public int getWeight() {
        return weight;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    void jump() {
        if (jump_history.isEmpty()) {
            jump_history += "jump_1";
        } else {
            jump_history += " next jump";
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", weight=" + weight +
                ", jump_history='" + jump_history + '\'' +
                '}';
    }
}

class Book {
    private int amount_of_pages;
    private int watching_page_number;

    private String watching_page_text;

    Book(int amount_of_pages) {
        this.amount_of_pages = amount_of_pages;
    }

    public int getAmountOfPages() {
        return amount_of_pages;
    }

    public int getWatchingPageNumber() {
        return watching_page_number;
    }

    public String getWatchingPageText() {
        return watching_page_text;
    }

    public void setAmountOfPages(int amount_of_pages) {
        this.amount_of_pages = amount_of_pages;
    }

    public void setWatchingPageNumber(int watching_page_number) {
        this.watching_page_number = watching_page_number;
    }

    public void setWatchingPageText(String watching_page_text) {
        this.watching_page_text = watching_page_text;
    }

    @Override
    public String toString() {
        return "Book{" +
                "amount_of_pages=" + amount_of_pages +
                ", watching_page_number=" + watching_page_number +
                ", watching_page_text='" + watching_page_text + '\'' +
                '}';
    }
}