import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private List<Student> students = new ArrayList<>();
    private int nextId = 1;
    
    public void add(Student student) {
        student.setId(nextId++);
        students.add(student);
        System.out.println("Student added: " + student.getName());
    }
    
    public List<Student> getAll() {
        return new ArrayList<>(students);
    }
    
    public void update(Student student, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                student.setId(id);
                students.set(i, student);
                System.out.println("Student updated: " + student.getName());
                break;
            }
        }
    }
    
    public void delete(int id) {
        students.removeIf(s -> s.getId() == id);
        System.out.println("Student deleted with ID: " + id);
    }
    
    public Student getById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}