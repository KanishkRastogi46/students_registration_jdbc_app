
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    public static Connection connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "kanishk@55055";

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
