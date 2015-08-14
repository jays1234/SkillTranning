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
public class JDBC04CallProcedure {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(JDBC04CallProcedure.class);
        JDBC01DataSource jdbc01DataSource = new JDBC01DataSource();
        OracleDataSource oracleDataSource = jdbc01DataSource.createDataSource();
        try {
            Connection connection = oracleDataSource.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{ call plus_number(?,?,?) }");
            callableStatement.registerOutParameter(3, Types.INTEGER);
            callableStatement.setInt(1,3);
            callableStatement.setInt(2,3);
            callableStatement.execute();
            logger.info("callableStatement : {}" ,callableStatement.getInt(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
