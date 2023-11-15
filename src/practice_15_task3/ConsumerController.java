package practice_15_task3;

import java.util.ArrayList;

public class ConsumerController {
    private final Consumer model;
    private final ConsumerView view;

    ConsumerController(Consumer model, ConsumerView view) {
        this.model = model;
        this.view = view;
    }

    public void setConsumerName(String name) {
        model.setName(name);
    }

    public String getConsumerName() {
        return model.getName();
    }

    public void setConsumerOrderList(ArrayList<Order> orders) {
        model.setOrders(orders);
    }

    public ArrayList<Order> getConsumerOrderList() {
        return model.getOrders();
    }

    public void setConsumerFullWastes() {
        model.setFullWastes(this.countConsumerFullWastes());
    }

    private int countConsumerFullWastes() {
        ArrayList<Order> order_list = model.getOrders();
        int sum = 0;
        if (order_list.size() > 0) {
            for (int i = 0; i < order_list.size(); i++) {
                sum += order_list.get(i).order_price;
            }
        }
        //order_list.clear();
        return sum;
    }

    public void addConsumerOrder(String order_id, int order_price) {
        ArrayList<Order> order_list = model.getOrders();
        order_list.add(new Order(order_id, order_price));
        model.setOrders(order_list);
    }

    public void update(ConsumerController controller) {
        setConsumerName(controller.getConsumerName());
        setConsumerOrderList(controller.getConsumerOrderList());
        setConsumerFullWastes();
    }
    public int getConsumerFullWastes() {
        return model.getFullWastes();
    }
}
