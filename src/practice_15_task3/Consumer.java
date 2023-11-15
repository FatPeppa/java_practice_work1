package practice_15_task3;

import java.util.ArrayList;

class Order {
    String order_id;
    int order_price;
    Order(String order_id, int order_price) {
        this.order_id = order_id;
        this.order_price = order_price;
    }

    public String toString() {
        return ("{'" + order_id + "', '" + order_price + "'}");
    }
}

public class Consumer {
    private String name;
    private int full_wastes;

    private ArrayList<Order> orders;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFullWastes(int full_wastes) {
        this.full_wastes = full_wastes;
    }

    public int getFullWastes() {
        return full_wastes;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
