package com.mycompany.studentmanagementsystem;
// rest of code
import javax.swing.*;
import java.awt.*;

public class About {

    public static void showAbout() {
        // Create the frame
        JFrame frame = new JFrame("About - Student Management System");
        frame.setSize(650, 500);
        frame.setMinimumSize(new Dimension(500, 400));
        frame.setLocationRelativeTo(null); // center on screen
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Text area for content
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Serif", Font.PLAIN, 15));
        textArea.setMargin(new Insets(10, 10, 10, 10));

        // Set About text
        textArea.setText(
            "STUDENT MANAGEMENT SYSTEM\n\n" +

            "About the System\n" +
            "The Student Management System is a Java-based application.\n" +
            "It helps manage student records efficiently.\n" +
            "Users can log in and perform operations like adding, updating, deleting, and searching records.\n\n" +

            "How the System Works\n" +
            "The system uses a GUI built with Java Swing.\n" +
            "User inputs are validated before processing.\n" +
            "Data is stored securely in a database using JDBC.\n" +
            "This ensures accuracy and completeness.\n\n" +

            "Purpose\n" +
            "This system was created as a practical learning project.\n" +
            "It applies object-oriented programming concepts, database integration, and UI design.\n" +
            "It demonstrates solving real-world problems with software.\n\n" +

            "Problem Solved\n" +
            "Manual record keeping is slow and error-prone.\n" +
            "The system organizes data digitally and reduces mistakes.\n" +
            "It allows quick access to student information.\n\n" +

            "Impact\n" +
            "The system improves efficiency in managing student data.\n" +
            "It enhances accuracy and reliability.\n" +
            "It can be used in schools or institutions.\n\n" +

            "Contact\n" +
            "For inquiries or support, contact:\n" +
            "Email: mukabera255@gmail.com"
        );

        // Put text area in scroll pane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Add scroll pane to frame center
        frame.add(scrollPane, BorderLayout.CENTER);

        // Close button at bottom
        JButton btnClose = new JButton("Close");
        btnClose.addActionListener(e -> frame.dispose());
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(btnClose);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Show the frame
        frame.setVisible(true);
    }

    // Optional main for testing
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> About.showAbout());
    }
}