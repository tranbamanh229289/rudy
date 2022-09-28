package ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private String hostName = "localhost:3307";
    private String dbName = "rudy";
    private String userName = "root";
    private String password = "2292892000";

    private String connectionURL = "jdbc:mysql://" + hostName + "/" + dbName;

    public Connection connect() {
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(connectionURL, userName, password);
            System.out.println("Connect Success !!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
