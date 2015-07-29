package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by phirayu on 19/7/2558.
 */
public class JDBC03Transaction {
    public static void main(String[] args){
        Connection connection = null ;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "phirayu", "123456");
            connection.setAutoCommit(false);
            String sql = "insert into SET_PERSON values (?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"aaaaaa");
            preparedStatement.setString(2,"jay");
            preparedStatement.setString(3,"aaaa");
            preparedStatement.setInt(4,1);
            preparedStatement.setInt(5,1);
            preparedStatement.setString(6,"M");
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            }
            catch (SQLException e1) {
                e.printStackTrace();
            }
        }

    }
}
