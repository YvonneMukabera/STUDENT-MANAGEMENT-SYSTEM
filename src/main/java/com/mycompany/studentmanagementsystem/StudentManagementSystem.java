package com.mycompany.studentmanagementsystem;
// rest of code
//package com.mycompany.studentmanagementsystem;
//import LoginForm;
/**
 *
 * @author user
 */
public class StudentManagementSystem {
 public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        java.util.prefs.Preferences prefs = java.util.prefs.Preferences.userRoot();
        String sessionActive = prefs.get("logged_in_session", "false");
        
        if ("true".equals(sessionActive)) {
            // Session exists, go directly to MainPage
            String savedRole = prefs.get("session_role", "");
            if (!savedRole.isEmpty()) {
                try {
                    UserRole role = UserRole.valueOf(savedRole);
                    new MainPage(role).setVisible(true);
                } catch (IllegalArgumentException e) {
                    new LoginForm().setVisible(true);
                }
            } else {
                new LoginForm().setVisible(true);
            }
        } else {
            // No session, show login
            new LoginForm().setVisible(true);
        }
    });
}
}
