package service;


import dao.CRUD_Order;
import dao.CRUD_Product;
import model.Order;

import java.util.List;

public class OrderService {
    public static List<Order> orders = CRUD_Order.getAll();

    public static void add(Order order) {
        orders.add(order);
        CRUD_Order.save(order);
    }
}