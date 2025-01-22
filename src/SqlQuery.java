public class SqlQuery {
    public static final String create = "INSERT INTO students(id, name, email, phone) VALUES(?, ?, ?, ?)";
    public static final String read = "SELECT * FROM students";
    public static final String update = "UPDATE students SET email = ?, phone = ? WHERE id = ?";
    public static final String delete = "DELETE FROM students WHERE id = ?";
}
