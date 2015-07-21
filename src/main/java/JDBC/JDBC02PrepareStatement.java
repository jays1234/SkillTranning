package JDBC;

import oracle.jdbc.pool.OracleDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.*;

/**
 * Created by phirayu on 7/17/15.
 */
public class JDBC02PrepareStatement {
    Logger logger = LoggerFactory.getLogger(JDBC02PrepareStatement.class);
    public static void main(String[] args){
        JDBC02PrepareStatement jdbc02PrepareStatement = new JDBC02PrepareStatement();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "phirayu", "123456");


            jdbc02PrepareStatement.query(connection);
            //jdbc02PrepareStatement.insert(connection);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    private void update(Connection connection){
        String update = "update set_person set name = ? where person_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(update);
            preparedStatement.setString(1,"jays");
            preparedStatement.setString(2,"5403001");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void insert(Connection connection){
        String insert = "insert into SET_PERSON values (?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1,"aaaaaa");
            preparedStatement.setString(2,"jay");
            preparedStatement.setString(3,"aaaa");
            preparedStatement.setInt(4,1);
            preparedStatement.setInt(5,1);
            preparedStatement.setString(6,"M");
            preparedStatement.executeUpdate();
            logger.info("insert Success");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void query(Connection connection){
        String select = "select * from SET_PERSON where PERSON_ID = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(select);
            preparedStatement.setString(1,"5403001");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                logger.info(resultSet.getString("NAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
