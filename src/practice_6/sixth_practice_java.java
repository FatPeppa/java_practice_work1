package practice_6;

import java.util.ArrayList;
import java.util.Random;

public class sixth_practice_java {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        Plate test_plate = new Plate(15, "white");
        test_plate.isUsingToEatFrom();
        System.out.println(test_plate.toString());
        Bowl test_bowl = new Bowl(20, "Black", 10);
        System.out.println(test_bowl.toString());
        test_bowl.setDeep(30);
        System.out.println(test_bowl.toString());
        System.out.println();
        System.out.println();
        System.out.println();

        //task 2
        System.out.println("Task 2");
        LittleDog dog_test_1 = new LittleDog(2, 100, "black");
        System.out.println(dog_test_1.toString());
        dog_test_1.makeNoise();
        dog_test_1.aggression = 1000;
        System.out.println(dog_test_1.toString());
        MediumDog dog_test_2 = new MediumDog(1, 100, "white");
        System.out.println(dog_test_2.toString());
        dog_test_2.makeNoise();
        dog_test_2.sayCuty();
        System.out.println();
        System.out.println();
        System.out.println();

        //task 3
        System.out.println("Task 3");
        FurnitureShop shop_test = new FurnitureShop(100, 100);
    }
}

//task 1
abstract class Dish {
    int size;
    String color;

    public abstract int getSize();
    public abstract String getColor();
    public abstract void setColor(String color);
    public abstract void setSize(int size);
}

class Plate extends Dish {

    @Override
    public int getSize() {return this.size;}

    @Override
    public String getColor() {return this.color;}

    @Override
    public void setColor(String color) {this.color = color;}

    @Override
    public void setSize(int size) {this.size = size;}

    Plate(int size, String color) {
        this.size = size;
        this.color = color;
    }

    void isUsingToEatFrom() {
        System.out.println("It is using to eat from!");
    }

    @Override
    public String toString() {
        return "Plate{" +
                ", size=" + size +
                ", color=" + color +
                '}';
    }
}

class Bowl extends Dish {
    int deep;
    @Override
    public int getSize() {
        return size;
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
    public void setSize(int size) {
        this.size = size;
    }

    Bowl(int size, String color, int deep) {
        this.size = size;
        this.color = color;
        this.deep = deep;
    }

    public void setDeep(int deep) {
        this.deep = deep;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "deep=" + deep +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}

//task 2
abstract class Dog {
    String color;
    int age;

    public abstract void setAge(int age);
    public abstract void setColor(String color);
    public abstract int getAge();
    public abstract String getColor();

    public abstract void makeNoise();
}

class LittleDog extends Dog {
    int aggression;

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }

    LittleDog(int age, int aggression, String color) {
        this.age = age;
        this.aggression = aggression;
        this.color = color;
    }

    @Override
    public String toString() {
        return "LittleDog{" +
                "aggression=" + aggression +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

class MediumDog extends Dog {
    int cuty;
    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }

    MediumDog(int age, int cuty, String color) {
        this.age = age;
        this.cuty = cuty;
        this.color = color;
    }

    public void sayCuty() {
        makeNoise();
        System.out.println("My cutiness: " + cuty);
    }

    public int getCuty() {
        return cuty;
    }

    public void setCuty(int cuty) {
        this.cuty = cuty;
    }

    @Override
    public String toString() {
        return "MediumDog{" +
                "cuty=" + cuty +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

//task 3
abstract class Furniture {
    int price;
    String color;
}

class Chair extends Furniture {
    int legs_amount;

    Chair(int price, int legs_amount, String color) {
        this.color = color;
        this.legs_amount = legs_amount;
        this.price = price;
    }
}

class Table extends Furniture {
    int max_weight;
    int radius;

    Table(int price, String color, int max_weight, int radius) {
        this.price = price;
        this.color = color;
        this.radius = radius;
        this.max_weight = max_weight;
    }
}

class FurnitureShop {
    ArrayList<Chair> chairs = new ArrayList<>();
    ArrayList<Table> tables = new ArrayList<>();

    ArrayList<Chair> sold_chairs = new ArrayList<>();
    ArrayList<Table> sold_tables = new ArrayList<>();

    int total_revenue = 0;
    FurnitureShop(int start_chairs_amount, int start_tables_amount) {
        Random rand = new Random();
        for (int i = 0; i < start_chairs_amount; i++) {
            if (rand.nextInt(2) == 1) {
                chairs.add(new Chair(300, 4,"Black"));
            } else {
                chairs.add(new Chair(500, 3, "White"));
            }
        }

        for (int i = 0; i < start_tables_amount; i++) {
            if (rand.nextInt(2) == 1) {
                tables.add(new Table(100, "Brown", 10, 150));
            } else {
                tables.add(new Table(300, "Black", 60, 200));
            }
        }

        while (!(chairs.isEmpty() && tables.isEmpty())) {
            next_step();
        }

        println("Imitation finished!!!");
        println("Total revenue: " + total_revenue);
    }

    private int sumSoldChairsPrice() {
        int sum = 0;
        if (sold_chairs.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < chairs.size(); i++) {
            sum += chairs.get(i).price;
        }
        return sum;
    }

    private int sumSoldTablesPrice() {
        int sum = 0;
        if (sold_tables.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < tables.size(); i++) {
            sum += tables.get(i).price;
        }
        return sum;
    }

    private void println(String output) {
        System.out.println(output);
    }
    void next_step() {
        Random rand = new Random();
        println("Next step!");

        if (chairs.isEmpty() && sumSoldChairsPrice() == 0) {
            println("Chairs run out!");
        } else {
            println("Current amount of chairs: " + chairs.size());
            println("Amount of sold chairs in the previous step: " + sold_chairs.size());
            println("Sold chairs revenue: " + sumSoldChairsPrice());
        }

        if (tables.isEmpty() && sumSoldTablesPrice() == 0) {
            println("Tables run out!");
        } else {
            println("Current amount of tables: " + tables.size());
            println("Amount of sold tables in the previous step: " + sold_tables.size());
            println("Sold tables revenue: " + sumSoldTablesPrice());
        }

        sold_tables.clear();
        sold_chairs.clear();

        if (!tables.isEmpty()) {
            for (int i = 0; i < rand.nextInt(tables.size()); i++) {
                sold_tables.add(tables.get(0));
                tables.remove(0);
            }

            if (tables.size() == 1) {
                sold_tables.add(tables.get(0));
                tables.clear();
            }
        }

        if (!chairs.isEmpty()) {
            for (int i = 0; i < rand.nextInt(chairs.size()); i++) {
                sold_chairs.add(chairs.get(0));
                chairs.remove(0);
            }

            if (chairs.size() == 1) {
                sold_chairs.add(chairs.get(0));
                chairs.clear();
            }
        }

        total_revenue += sumSoldChairsPrice() + sumSoldTablesPrice();
    }
}