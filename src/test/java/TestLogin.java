import java.sql.Connection;
import java.sql.SQLException;

public class TestLogin {
    public static void main(String[] args) {
        System.out.println("=== TESTING DATABASE CONNECTION ===");
        
        // Test 1: Connection with detailed error handling
        try {
            System.out.println("Attempting to get connection...");
            Connection conn = DatabaseConnection.getConnection();
            System.out.println("Connection test: PASSED");
            System.out.println("Connection info: " + conn.getMetaData().getURL());
            conn.close();
            System.out.println("Connection closed successfully");
        } catch (SQLException e) {
            System.out.println("SQL ERROR: " + e.getMessage());
            System.out.println("Error code: " + e.getErrorCode());
            System.out.println("SQL state: " + e.getSQLState());
            e.printStackTrace();
            return;
        } catch (Exception e) {
            System.out.println("GENERAL ERROR: " + e.getMessage());
            e.printStackTrace();
            return;
        }
        
        // Test 2: Login validation
        System.out.println("\n=== TESTING LOGIN VALIDATION ===");
        
        String[][] testUsers = {
            {"admin", "admin123", "ADMIN"},
            {"teacher", "teacher123", "TEACHER"},
            {"student", "student123", "STUDENT"},
            {"wrong", "wrong", "should fail"}
        };
        
        for (String[] user : testUsers) {
            String username = user[0];
            String password = user[1];
            String expectedRole = user[2];
            
            System.out.println("\nTesting " + username + "/" + password + "...");
            
            try {
                UserRole role = DatabaseConnection.validateLogin(username, password);
                
                if (role != null) {
                    System.out.println("  ✓ SUCCESS - Got role: " + role);
                    if (role.toString().equals(expectedRole)) {
                        System.out.println("  ✓ Role matches expected: " + expectedRole);
                    } else {
                        System.out.println("  ✗ Role mismatch - Expected: " + expectedRole + ", Got: " + role);
                    }
                } else {
                    System.out.println("  ✗ FAILED - Login rejected");
                    if (expectedRole.equals("should fail")) {
                        System.out.println("  ✓ Correctly rejected invalid user");
                    }
                }
            } catch (Exception e) {
                System.out.println("  ✗ ERROR - " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}