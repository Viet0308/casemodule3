package dao;

import model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static dao.CRUD_Product.connection;

public class OrderDAO {
    public static Product getProductById(int id){
        String sql = "SELECT * FROM product where id = ?";
        try {
            // tạo cái xe để đưa câu lệnh sql qua CSDL
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, String.valueOf(id));
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()){
                return new Product(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDouble(4));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
