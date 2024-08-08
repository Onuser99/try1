package utils;
import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.itshaala.constants.MysqlConstants.*;
import static constants.MysqlConstants.*;

public class ConnectionUtil {
    @Getter
    private static Connection connection;

    static {
        try {
            Class.forName(MYSQL_DRIVER_CLASS);
            connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("driver class not found " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("invalid credentials " + e.getMessage());
        }
    }
}