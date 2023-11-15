package practice_4;

public class fourth_practice_java {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        CircleTest circleTest1 = new CircleTest(10, 12);
        HumanTest humanTest = new HumanTest();
        BookTest bookTest = new BookTest();
    }
}


class Circle {
    private int coordinate;
    private int radius;
    Circle (int coordinate, int radius) {
        this.coordinate = coordinate;
        this.radius = radius;
    }

    void move(int moveLength) {
        coordinate += moveLength;
    }

    void changeRadius(int extra_radius) {
        this.radius += extra_radius;
    }

    public int getRadius() {
        return radius;
    }

    public int getCoordinate() {
        return coordinate;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCoordinate(int coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "coordinate=" + coordinate +
                ", radius=" + radius +
                '}';
    }
}

class CircleTest {
    CircleTest() {
        System.out.println("Testing with human check");
        String[] args = new String[] {"Human"};
        main(args);
    }

    int checkCoord;
    int checkRadius;

    CircleTest(int checkCoord, int checkRadius) {
        this.checkRadius = checkRadius;
        this.checkCoord = checkCoord;

        String[] args = new String[] {Integer.toString(checkCoord), Integer.toString(checkRadius)};
        main(args);
    }

    public static void main(String[] args) {
        switch (args.length) {
            case 1: {
                if (args[0].equals("Human")) {
                    Circle test_circle = new Circle(1, 2);

                    System.out.println(test_circle.toString());
                    test_circle.changeRadius(10);
                    System.out.println(test_circle.toString());
                    test_circle.move(15);
                    System.out.println(test_circle.toString());
                }

                break;
            }
            case 2: {
                Circle test_circle = new Circle(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

                System.out.println(test_circle.toString());
                test_circle.move(15);
                test_circle.changeRadius(10);
                System.out.println(test_circle.toString());

                if (test_circle.getCoordinate() == Integer.parseInt(args[0]) + 15 &&
                    test_circle.getRadius() == Integer.parseInt(args[1]) + 10) {
                    System.out.println("Circle test successful!");
                } else {
                    System.out.println("Circle test error!");
                }

                break;
            }
            default: {
                System.out.println("Error due testing");
                break;
            }
        }
    }
}

//task 2
class Human {
    private static class Head {
        private int size;
        private String eyeColor;

        Head(int size, String eyeColor) {
            this.eyeColor = eyeColor;
            this.size = size;
        }

        public int getSize() {return size;}

        public String getEyeColor() {return eyeColor;}

        public void setEyeColor(String eyeColor) {this.eyeColor = eyeColor;}

        public void setSize(int size) {this.size = size;}

        public void setHeadSizeIllness() {
            size += 15;
            System.out.println("Head illness occurred!");
        }

        @Override
        public String toString() {
            return "Head{" +
                    "size=" + size +
                    ", eyeColor='" + eyeColor + '\'' +
                    '}';
        }
    }

    private static class Leg {
        private int available_leg_amount;
        private int length;
        Leg (int available_leg_amount, int length) {
            this.available_leg_amount = available_leg_amount;
            this.length = length;

            if (available_leg_amount != 2) {
                System.out.println("Created a very unlucky man");
            }
        }

        public void grow(int leg_growth) {
            length += leg_growth;
        }

        public void deleteLeg() {
            if (available_leg_amount > 0) {
                available_leg_amount -= 1;
            } else {
                System.out.println("This man do not have any legs!");
            }
        }

        public int getAvailable_leg_amount() {return available_leg_amount;}

        public int getLength() {return length;}

        public void setLength(int length) {this.length = length;}

        public void setAvailable_leg_amount(int available_leg_amount) {this.available_leg_amount = available_leg_amount;}

        @Override
        public String toString() {
            return "Leg{" +
                    "available_leg_amount=" + available_leg_amount +
                    ", length=" + length +
                    '}';
        }
    }

    private static class Hand {
        private int available_hand_amount;
        private int length;
        Hand (int available_hand_amount, int length) {
            this.available_hand_amount = available_hand_amount;
            this.length = length;

            if (available_hand_amount != 2) {
                System.out.println("Created a very unlucky man");
            }
        }

        public void grow(int hand_growth) {
            length += hand_growth;
        }

        public void deleteHand() {
            if (available_hand_amount > 0) {
                available_hand_amount -= 1;
            } else {
                System.out.println("This man do not have any hands!");
            }
        }

        public int getAvailable_hand_amount() {return available_hand_amount;}

        public int getLength() {return length;}

        public void setLength(int length) {this.length = length;}

        public void setAvailable_hand_amount(int available_hand_amount) {this.available_hand_amount = available_hand_amount;}

        @Override
        public String toString() {
            return "Hand{" +
                    "available_hand_amount=" + available_hand_amount +
                    ", length=" + length +
                    '}';
        }
    }

    Head head;
    Hand hands;
    Leg legs;

    Human(int legs_amount, int legs_length, int hands_amount, int hands_length, int head_size, String eyeColor) {
        head = new Head(head_size, eyeColor);
        hands = new Hand(hands_amount, hands_length);
        legs = new Leg(legs_amount, legs_length);
    }

    void setHeadIllness() {
        head.setHeadSizeIllness();
    }

    String getEyeColor() {
        return head.getEyeColor();
    }

    void deleteHand() {
        hands.deleteHand();
    }

    void deleteLeg() {
        legs.deleteLeg();
    }

    void grow(int growth) {
        legs.grow(growth);
        hands.grow(growth);
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head.toString() +
                ", hands=" + hands.toString() +
                ", legs=" + legs.toString() +
                '}';
    }
}

class HumanTest {
    HumanTest() {
        String[] args = {""};
        main(args);
    }

    public static void main(String[] args) {
        Human test_human = new Human(2, 90, 2,
                            70, 30, "Brown");

        test_human.deleteHand();
        test_human.deleteHand();
        test_human.deleteHand();
        System.out.println(test_human.toString());
        test_human.deleteLeg();
        System.out.println(test_human.toString());
        test_human.getEyeColor();
        test_human.setHeadIllness();
        System.out.println(test_human.toString());
        test_human.grow(30);
        System.out.println(test_human.toString());
    }
}

//task 3
class Book {
    static class Author {
        String name;
        int age;

        Author(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public void setAge(int age) {this.age = age;}

        public void setName(String name) {this.name = name;}

        @Override
        public String toString() {
            return "Author{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    private final Author author;
    private String book_name;
    private int year;
    private int pages_amount;

    Book(int author_age, String author_name, String book_name,
         int year, int pages_amount) {
        author = new Author(author_age, author_name);
        this.book_name = book_name;
        this.pages_amount = pages_amount;
        this.year = year;
    }

    private void print(String str_to_print) {
        System.out.println(str_to_print);
    }
    void printAuthorInfo() {
        print(author.toString());
    }

    void changeAuthor(int author_age, String author_name) {
        author.setAge(author_age);
        author.setName(author_name);
    }

    public int getPages_amount() {return pages_amount;}

    public void setPages_amount(int pages_amount) {this.pages_amount = pages_amount;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    public String getBook_name() {return book_name;}

    public void setBook_name(String book_name) {this.book_name = book_name;}

    public void add_pages(int extra_pages_amount) {
        if (extra_pages_amount > 0) {
            pages_amount += extra_pages_amount;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author.toString() +
                ", book_name='" + book_name + '\'' +
                ", year=" + year +
                ", pages_amount=" + pages_amount +
                '}';
    }
}

class BookTest {
    BookTest() {
        String[] args = {""};
        main(args);
    }

    private static void print(String str_to_print) {
        System.out.println(str_to_print);
    }

    public static void main(String[] args) {
        Book test_book = new Book(25, "Mike",
                "GreatBook", 2022, 145);
        print(test_book.toString());
        test_book.changeAuthor(40, "Nick");
        print(test_book.toString());
        test_book.setYear(1234);
        test_book.add_pages(44);
        print(test_book.toString());
    }
}