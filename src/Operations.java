import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class Operations {
    public static void create(Connection conn, int id, String name, String email, String phone) throws SQLException {
        try {
            PreparedStatement psmt = conn.prepareStatement(SqlQuery.create);
            psmt.setInt(1, id);
            psmt.setString(2, name);
            psmt.setString(3, email);
            psmt.setString(4, phone);
            psmt.executeUpdate();
            System.out.println("Record inserted successfully\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    public static ArrayList<Students> read(Connection conn) throws SQLException {
        ArrayList<Students> result = new ArrayList<>();
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(SqlQuery.read);
            while (rs.next()) {
                Students st = new Students(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("phone"));
                result.add(st);
            }
            System.out.println("Records retrieved successfully\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    };

    public static void update(Connection conn, int id) throws SQLException {
        try {
            PreparedStatement psmt = conn.prepareStatement(SqlQuery.update);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter email: ");
            String email = sc.next();
            System.out.println("Enter phone: ");
            String phone = sc.next();
            psmt.setInt(3, id);
            psmt.setString(1, email);
            psmt.setString(2, phone);
            psmt.executeUpdate();
            System.out.println("Record updated successfully\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    public static void delete(Connection conn, int id) {
        try {
            PreparedStatement psmt = conn.prepareStatement(SqlQuery.delete);
            psmt.setInt(1, id);
            psmt.executeUpdate();
            System.out.println("Record deleted successfully\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    };
}
