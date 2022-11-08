//package dao;
//
//import model.DetailOrder;
//import model.Order;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class CRUD_DetailOrder {
//    static Connection connection = ConnectMySQL.getConnection();
//
//    public static List<Order> getAll() {
//        String sql = "select * from DetailOrder";
//        List<DetailOrder> detailOrders = new ArrayList<>();
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sql);
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id_order");
//                int id_product = resultSet.getInt("id_product");
//                int amount = resultSet.getInt("amount");
//                detailOrders.add(new DetailOrders(id, id_product, amount));
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return detailOrders;
//    }
//    public static void save(Order order) {
//        try {
//            String sql = "insert into `order` value (?,?,?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setInt(1, order.getId());
//            preparedStatement.setInt(2, order.getId_Account());
//            preparedStatement.setDate(3, order.getDate());
//            preparedStatement.execute();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
//
//}
