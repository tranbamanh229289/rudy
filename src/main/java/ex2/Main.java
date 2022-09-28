package ex2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connect connect = new Connect();
        Connection conn = connect.connect();

        String query = "SELECT * FROM thing";
        Statement stm = null;

        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            System.out.println("List items: ");

            while (rs.next()) {
                String type = rs.getString("type");
                Thing thing = null;
                if (type.equals("BOOK")) {
                    thing = new BookOnTape(rs.getLong("serial_number"), rs.getString("name"), rs.getString("price"));
                }
                if (type.equals("VIDEO")) {
                    thing = new Video(rs.getLong("serial_number"), rs.getString("name"), rs.getString("price"));
                }
                if (type.equals("FURNITURE")) {
                    thing = new Furniture(rs.getLong("serial_number"), rs.getString("name"), rs.getString("price"));
                }
                System.out.println(thing.getDescription());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.close();
    }
}
