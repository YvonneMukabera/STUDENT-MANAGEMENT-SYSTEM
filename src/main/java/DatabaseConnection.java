import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3307/student_management?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver loaded successfully!");
        } catch (ClassNotFoundException e) {
            System.err.println("Error loading MySQL JDBC Driver:");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws Exception {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Connected to database successfully!");
        return conn;
    }

    public static UserRole validateLogin(String username, String password) {
        System.out.println("Attempting login for: " + username);
        
        String sql = "SELECT role FROM users WHERE username = ? AND password = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            System.out.println("Executing query: " + sql);
            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                String roleStr = rs.getString("role");
                System.out.println("Login successful: " + username + " (Role: " + roleStr + ")");
                return UserRole.valueOf(roleStr.toUpperCase());
            } else {
                System.out.println("Login failed: " + username + " - No matching user found");
                return null;
            }

        } catch (Exception e) {
            System.err.println("Error during login check:");
            e.printStackTrace();
            return null;
        }
    }

    public static boolean testConnection() {
        try (Connection conn = getConnection()) {
            System.out.println("Connection test passed!");
            return conn != null && !conn.isClosed();
        } catch (Exception e) {
            System.err.println("Connection test failed:");
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Testing Database Connection...");
        
        if (testConnection()) {
            System.out.println("Database connection is working!");
            
            System.out.println("\nTesting Login Validation...");
            validateLogin("admin", "admin123");
            validateLogin("teacher", "teacher123");
            validateLogin("student", "student123");
        } else {
            System.out.println("Database connection failed!");
        }
    }
}