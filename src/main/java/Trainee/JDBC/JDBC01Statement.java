package Trainee.JDBC;

import oracle.jdbc.pool.OracleDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.*;

/**
 * Created by phirayu on 7/17/15.
 */
public class JDBC01Statement {
    Logger logger = LoggerFactory.getLogger(JDBC01Statement.class);
    public static void main(String[] args){
        JDBC01Statement jdbc01Statement = new JDBC01Statement();
        String insert = "Insert into SET_PERSON (PERSON_ID,NAME,LASTNAME,CLASS_ID,ROLE_ID,SEX) values ('570100aaa','aaaa','bbbbb',1,1,'M')";
        String update = "update SET_PERSON set NAME = 'JAY' where LASTNAME = 'bbbbb'";
        String delete = "delete from SET_PERSON where NAME = 'JAY'";

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","phirayu","123456");
            jdbc01Statement.selectData(connection);
            //jdbc01Statement.insertUpdateDelete(connection,delete);
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void selectData(Connection connection){
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String sql = "select * from SET_PERSON ";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                logger.info(resultSet.getString("PERSON_ID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    private void insertUpdateDelete(Connection connection,String sql){

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            logger.info("insert Success");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
