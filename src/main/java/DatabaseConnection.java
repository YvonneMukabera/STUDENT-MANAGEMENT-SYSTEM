import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnection {

    // MySQL database info — adjust port and credentials if needed
    private static final String URL = "jdbc:mysql://localhost:3306/student_management?serverTimezone=UTC&useSSL=false";
    private static final String USER = "root";  // change to your MySQL username
    private static final String PASSWORD = "";  // change to your MySQL password

    // Method to get database connection
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Connected to database successfully!");
        return conn;
    }

    // Method to validate login
    public static boolean validateLogin(String username, String password) {
        System.out.println("Attempting login for: " + username + " / " + password);
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            boolean loginSuccess = rs.next();

            if (loginSuccess) {
                System.out.println("Login successful: " + username);
            } else {
                System.out.println("Login failed: " + username);
            }

            return loginSuccess;

        } catch (Exception e) {
            System.err.println("Error during login check:");
            e.printStackTrace();
            return false;
        }
    }

    // Quick test main
    public static void main(String[] args) {
        try {
            validateLogin("admin", "admin123"); // Test user from your DB
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}