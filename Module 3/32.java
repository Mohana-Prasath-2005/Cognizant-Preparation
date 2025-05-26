import java.sql.*;

public class StudentDAO {
    Connection conn;

    public StudentDAO() throws Exception {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdb", "root", "password");
    }

    public void insertStudent(int id, String name) throws Exception {
        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();
    }

    public void updateStudent(int id, String newName) throws Exception {
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, newName);
        ps.setInt(2, id);
        ps.executeUpdate();
    }
}
