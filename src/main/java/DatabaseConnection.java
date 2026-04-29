package com.mycompany.studentmanagementsystem;
// rest of code
import java.sql.*;

public class DatabaseConnection {
    // Update these values based on MySQL setup
    private static final String URL = "jdbc:mysql://localhost:3307/student_management?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "";  // Empty for XAMPP default

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver loaded successfully!");
        } catch (ClassNotFoundException e) {
            System.err.println("Error loading MySQL JDBC Driver: " + e.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // This is the method your LoginForm is calling
    public static UserRole validateLogin(String username, String password) {
        System.out.println("Attempting login for: " + username);
        
        String sql = "SELECT role FROM users WHERE username = ? AND password = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

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

        } catch (SQLException e) {
            System.err.println("Error during login check:");
            e.printStackTrace();
            return null;
        }
    }

    public static boolean testConnection() {
        try (Connection conn = getConnection()) {
            System.out.println("Connection test passed!");
            return true;
        } catch (SQLException e) {
            System.err.println("Connection test failed: " + e.getMessage());
            return false;
        }
    }
}