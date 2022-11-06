package dao;

import com.mysql.cj.protocol.Resultset;
import model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class LoginDAO {

    public static Account login(String username, String password){
        String sqL = "select * from account where username = ? and password = ?";
        Connection connection = ConnectMySQL.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqL);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);

            ResultSet resultSet = preparedStatement.executeQuery();
            Account account = null;
            if(resultSet.next()) {
                int id = resultSet.getInt("id");
                String username1 = resultSet.getString("username");
                String password1 = resultSet.getString("password");
                String address = resultSet.getString("address");
                Date birthday = resultSet.getDate("birthday");
                int id_role = resultSet.getInt("id_role");
                account = new Account(id, username1, password1, address, birthday, id_role);
                return account;

            }
            return account;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
