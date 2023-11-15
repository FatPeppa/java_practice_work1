package practice_9;

//task 1
interface Nameable {
    String getName();
}

class Planet implements Nameable{
    private String name;
    Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

class Car implements Nameable {
    private String name;

    Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

//task 2
interface Priceable {
    int getPrice();
}

class Ball implements Priceable{
    private int price;
    Ball(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

class Tomato implements Priceable{
    private int price;
    Tomato(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}


public class ninth_practice_java {
    public static void main(String[] args) {
        Car test_car = new Car("BMW");
        Planet test_planet = new Planet("Jupiter");
        System.out.println("Car name: " + test_car.getName());
        System.out.println("Planet name: " + test_planet.getName());

        Ball test_ball = new Ball(400);
        Tomato test_tomato = new Tomato(100);
        System.out.println("Ball price: " + test_ball.getPrice());
        System.out.println("Tomato price: " + test_tomato.getPrice());
    }
}
