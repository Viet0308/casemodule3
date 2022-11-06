package dao;

import com.oracle.wls.shaded.org.apache.xpath.operations.Or;
import model.Order;
import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUD_Order {
    static Connection connection = ConnectMySQL.getConnection();

    public static List<Order> getAll() {
        String sql = "select * from order";
        List<Order> orders = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int id_account = resultSet.getInt("id_account");
                Date date = resultSet.getDate("date");
                orders.add(new Order(id, id_account, date));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return orders;
    }
    public static void save(Order order) {
        try {
            String sql = "insert into `order` value (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, order.getId());
            preparedStatement.setInt(2, order.getId_Account());
            preparedStatement.setDate(3, order.getDate());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
