package Trainee.JDBC;


import oracle.jdbc.pool.OracleDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by phirayu on 19/7/2558.
 */
public class JDBC01DataSource {
    public static void main(String[] args){
        try {
            JDBC01DataSource jdbc01DataSource = new JDBC01DataSource();
            OracleDataSource oracleDataSource = jdbc01DataSource.createDataSource();


            Logger log = LoggerFactory.getLogger(JDBC01DataSource.class);
            Connection connection = oracleDataSource.getConnection();
            Statement statement = connection.createStatement();
            String sql = "select * from set_person";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                log.info(resultSet.getString("PERSON_ID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public OracleDataSource createDataSource(){
        OracleDataSource oracleDataSource = null;
        try {
            oracleDataSource = new OracleDataSource();
            oracleDataSource.setDriverType("thin");
            oracleDataSource.setServerName("localhost");
            oracleDataSource.setPortNumber(1521);
            oracleDataSource.setServiceName("xe");
            oracleDataSource.setUser("phirayu");
            oracleDataSource.setPassword("123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return oracleDataSource;

    }
}
