package dao;

import com.mysql.cj.jdbc.DatabaseMetaData;
import model.Account;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignupDAO {
    public static void save(Account account) {
        try {
            String sql = "insert into account(username,password,id_role) value (?,?,?)";
            Connection connection = ConnectMySQL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, account.getUsername());
            preparedStatement.setString(2, account.getPassword());
            preparedStatement.setInt(3, account.getId_role());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
    }
}

