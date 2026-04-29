package com.mycompany.studentmanagementsystem;
// rest of code
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    
    // ADD Student
    public void add(Student student) {
        String sql = "INSERT INTO students (name, email, course, marks) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getEmail());
            pstmt.setString(3, student.getCourse());
            pstmt.setInt(4, student.getMarks());
            
            pstmt.executeUpdate();
            System.out.println("Student added to MySQL database!");
            
        } catch (SQLException e) {
            System.out.println("Error adding student:");
            e.printStackTrace();
        }
    }
    
    // GET ALL Students
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students ORDER BY id";
        
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Student s = new Student(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("course"),
                    rs.getInt("marks")
                );
                students.add(s);
            }
            
        } catch (SQLException e) {
            System.out.println("Error getting students:");
            e.printStackTrace();
        }
        return students;
    }
    
    // UPDATE Student
    public void update(Student student, int id) {
        String sql = "UPDATE students SET name=?, email=?, course=?, marks=? WHERE id=?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getEmail());
            pstmt.setString(3, student.getCourse());
            pstmt.setInt(4, student.getMarks());
            pstmt.setInt(5, id);
            
            pstmt.executeUpdate();
            System.out.println("Student updated in MySQL database!");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // DELETE Student
    public void delete(int id) {
        String sql = "DELETE FROM students WHERE id=?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Student deleted from MySQL database!");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // GET Student by ID
    public Student getById(int id) {
        String sql = "SELECT * FROM students WHERE id=?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                return new Student(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("course"),
                    rs.getInt("marks")
                );
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    // SEARCH Students by name
    public List<Student> searchByName(String keyword) {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students WHERE name LIKE ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, "%" + keyword + "%");
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Student s = new Student(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("course"),
                    rs.getInt("marks")
                );
                students.add(s);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}