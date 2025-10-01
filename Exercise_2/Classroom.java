import java.util.*;
import java.util.logging.*;

public class Classroom {
    private static final Logger LOGGER = Logger.getLogger(Classroom.class.getName());
    private final String name;
    private final Map<String, Student> students;
    private final List<Assignment> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new LinkedHashMap<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student s) throws StudentAlreadyExistsException, InvalidOperationException {
        if (s == null)
            throw new InvalidOperationException("Student is null");
        if (students.containsKey(s.getId())) {
            throw new StudentAlreadyExistsException("Student with ID already exists: " + s.getId());
        }
        students.put(s.getId(), s);
        s.enroll(this);
        LOGGER.info("Student [" + s.getId() + "] has been enrolled in [" + name + "].");
        System.out.println("Student [" + s.getId() + "] has been enrolled in [" + name + "].");
    }

    public void removeStudent(String studentId) throws InvalidOperationException {
        if (!students.containsKey(studentId))
            throw new InvalidOperationException("Student not enrolled: " + studentId);
        Student s = students.remove(studentId);
        if (s != null)
            s.leave(this);
        LOGGER.info("Student [" + studentId + "] removed from [" + name + "].");
        System.out.println("Student [" + studentId + "] removed from [" + name + "].");
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in classroom " + name);
            return;
        }
        System.out.println("Students in " + name + ":");
        for (Student s : students.values()) {
            System.out.println("- " + s);
        }
    }

    // Assignment management
    public void scheduleAssignment(Assignment a) throws InvalidOperationException {
        if (a == null)
            throw new InvalidOperationException("Assignment null");
        assignments.add(a);
        LOGGER.info("Assignment scheduled for [" + name + "]: " + a.getTitle());
        System.out.println("Assignment scheduled for [" + name + "].");
        notifyStudents("New assignment: " + a.getTitle() + " in classroom " + name);
    }

    public Assignment findAssignmentById(String id) {
        for (Assignment a : assignments)
            if (a.getId().equals(id))
                return a;
        return null;
    }

    // Observer notification
    public void notifyStudents(String message) {
        for (Student s : students.values()) {
            s.update(this, message);
        }
    }

    public Collection<Student> getStudents() {
        return Collections.unmodifiableCollection(students.values());
    }
}
