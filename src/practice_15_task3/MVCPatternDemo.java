package practice_15_task3;

import java.util.ArrayList;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Consumer model = getConsumerFromDB();
        ConsumerView view = new ConsumerView();
        ConsumerController controller = new ConsumerController(model, view);
        controller.setConsumerFullWastes();
        view.setController(controller);
        view.createView();
    }

    public static Consumer getConsumerFromDB() {
        Consumer cons = new Consumer();
        String cons_name = "Ivan";
        Order order_1 = new Order("01", 20);
        Order order_2 = new Order("02", 30);
        ArrayList<Order> cons_orders = new ArrayList<>();
        cons_orders.add(order_1);
        cons_orders.add(order_2);
        cons.setOrders(cons_orders);
        cons.setName(cons_name);
        return cons;
    }
}
