package practice_15_task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ConsumerView extends JFrame {
    ConsumerController controller;
    JLabel consumer_name_label;
    JTextArea consumer_orders_label;
    JLabel consumer_wastes_label;
    JTextField new_order_id_text_field;
    JTextField new_order_price_text_field;
    JButton add_order_button;

    Font fnt = new Font("Times new roman",Font.BOLD,20);

    ConsumerView() {
        super("ConsumerView");
    }

    public void createView() {
        setLayout(null);
        add_order_button = new JButton("Add order");
        consumer_name_label = new JLabel("Consumer name: " + controller.getConsumerName());
        consumer_wastes_label = new JLabel("Consumer wastes: " + String.valueOf(controller.getConsumerFullWastes()));
        consumer_orders_label = new JTextArea("Consumer orders: " + orderListToString(controller.getConsumerOrderList()));
        new_order_id_text_field = new JTextField("Input order id");
        new_order_price_text_field = new JTextField("Input order price");

        new_order_id_text_field.setBounds(60,390,150,20);
        new_order_price_text_field.setBounds(270,390,150,20);
        add_order_button.setBounds((new_order_id_text_field.getX() + new_order_price_text_field.getX()) / 2,
                new_order_id_text_field.getY() + 30, 150,20);
        consumer_orders_label.setEditable(false);

        consumer_name_label.setBounds(add_order_button.getX() + 35, add_order_button.getY() - 60, 150, 20);
        consumer_wastes_label.setBounds(add_order_button.getX() + 35, consumer_name_label.getY() - 40, 150, 20);
        consumer_orders_label.setBounds(consumer_wastes_label.getX() - 30, consumer_wastes_label.getY() - 100, 150, 20);

        add_order_button.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        addNewOrderFromText();
                        new_order_id_text_field.setText("Input order id");
                        new_order_price_text_field.setText("Input order price");
                        controller.update(controller);
                        updateView();
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {}

                    @Override
                    public void mouseReleased(MouseEvent e) {}

                    @Override
                    public void mouseEntered(MouseEvent e) {}

                    @Override
                    public void mouseExited(MouseEvent e) {}
                }
        );

        consumer_orders_label.setSize(new Dimension(220, 100));
        consumer_orders_label.setLineWrap(true);
        add(consumer_name_label);
        add(consumer_wastes_label);
        add(consumer_orders_label);
        add(add_order_button);
        add(new_order_id_text_field);
        add(new_order_price_text_field);
        setSize(500,500);
        setVisible(true);
    }

    public void setController (ConsumerController controller) {
        this.controller = controller;
    }
    public void addNewOrderFromText() {
        try {
            if (Integer.parseInt(new_order_id_text_field.getText()) > 0 || Integer.parseInt(new_order_price_text_field.getText()) > 0) {
                controller.addConsumerOrder(getNewOrderIdFromText(), Integer.parseInt(getNewOrderPriceFromText()));
            }
        } catch (NumberFormatException e) {}
    }

    private String getNewOrderIdFromText() {
        return new_order_id_text_field.getText();
    }

    private String getNewOrderPriceFromText() {
        return new_order_price_text_field.getText();
    }

    private String orderListToString(ArrayList<Order> order_list) {
        String temp = "";
        if (order_list.size() > 0) {
            for (int i = 0; i < order_list.size(); i++) {
                if (i != order_list.size() - 1)
                    temp += order_list.get(i).toString() + ", ";
                else {
                    temp += order_list.get(i).toString();
                }
            }
        }

        return temp;
    }

    public ConsumerController getController(ConsumerController controller) {
        return controller;
    }

    public void updateView() {
        consumer_name_label.setText("Consumer name: " + controller.getConsumerName());
        consumer_wastes_label.setText("Consumer wastes: " + (new Integer(controller.getConsumerFullWastes())).toString());
        consumer_orders_label.setText("Consumer orders: " + orderListToString(controller.getConsumerOrderList()));
        consumer_orders_label.setLineWrap(true);
    }
}
