package Trainee.JDBC;

import oracle.jdbc.pool.OracleDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

/**
 * Created by phirayu on 19/7/2558.
 */
public class JDBC04CallFunction {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(JDBC04CallFunction.class);
        JDBC01DataSource jdbc01DataSource = new JDBC01DataSource();
        OracleDataSource oracleDataSource = jdbc01DataSource.createDataSource();
        try {
            Connection connection = oracleDataSource.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{? = call function_plus_number(?,?) }");
            callableStatement.setInt(2,2);
            callableStatement.setInt(3,3);
            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement.execute();
            logger.info("function_plus_number : {}",callableStatement.getInt(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
