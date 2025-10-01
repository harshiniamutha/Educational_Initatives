import java.time.*;
import java.util.*;
import java.util.logging.*;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Basic logger level
        Logger root = Logger.getLogger("");
        root.setLevel(Level.INFO);

        VirtualClassroomManager manager = VirtualClassroomManager.getInstance();
        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();
            try {
                switch (choice) {
                    case "1": // create classroom
                        System.out.print("Classroom name: ");
                        String cname = scanner.nextLine().trim();
                        manager.createClassroom(cname);
                        break;
                    case "2": // list classrooms
                        manager.listClassrooms();
                        break;
                    case "3": // remove classroom
                        System.out.print("Classroom name: ");
                        manager.removeClassroom(scanner.nextLine().trim());
                        break;
                    case "4": // add student to classroom
                        System.out.print("Classroom name: ");
                        String cc = scanner.nextLine().trim();
                        System.out.print("Student ID: ");
                        String sid = scanner.nextLine().trim();
                        System.out.print("Student Name: ");
                        String sname = scanner.nextLine().trim();
                        Classroom c = manager.getClassroom(cc);
                        Student s = new Student(sid, sname);
                        c.addStudent(s);
                        break;
                    case "5": // list students
                        System.out.print("Classroom name: ");
                        manager.getClassroom(scanner.nextLine().trim()).listStudents();
                        break;
                    case "6": // schedule assignment
                        System.out.print("Classroom name: ");
                        String cln = scanner.nextLine().trim();
                        Classroom classroom = manager.getClassroom(cln);
                        System.out.print("Assignment type (QUIZ/HOMEWORK/PROJECT): ");
                        AssignmentFactory.Type t = AssignmentFactory.Type
                                .valueOf(scanner.nextLine().trim().toUpperCase());
                        System.out.print("Title: ");
                        String title = scanner.nextLine().trim();
                        System.out.print("Description: ");
                        String desc = scanner.nextLine().trim();
                        System.out.print("Due date (YYYY-MM-DD): ");
                        LocalDate due = LocalDate.parse(scanner.nextLine().trim());
                        System.out.print("Grading (AUTO/TEACHER): ");
                        String g = scanner.nextLine().trim().toUpperCase();
                        GradingStrategy strategy = "AUTO".equals(g) ? new AutoGrading() : new TeacherReview();
                        Assignment a = AssignmentFactory.createAssignment(t, title, desc, due, strategy);
                        classroom.scheduleAssignment(a);
                        System.out.println("Assignment scheduled for " + cln +
                                " with ID: " + a.getId());
                        break;
                    case "7": // submit assignment
                        System.out.print("Classroom name: ");
                        Classroom cl = manager.getClassroom(scanner.nextLine().trim());
                        System.out.print("Student ID: ");
                        String stid = scanner.nextLine().trim();
                        System.out.print("Assignment ID: ");
                        String aid = scanner.nextLine().trim();
                        System.out.print("Submission content: ");
                        String content = scanner.nextLine().trim();
                        Student student = null;
                        for (Student st : cl.getStudents()) {
                            if (st.getId().equals(stid)) {
                                student = st;
                                break;
                            }
                        }
                        if (student == null)
                            throw new InvalidOperationException("Student not enrolled in the classroom.");
                        student.submitAssignment(cl, aid, content);
                        break;
                    case "0":
                        running = false;
                        System.out.println("Exiting. Goodbye.");
                        break;
                    default:
                        System.out.println("Unknown option.");
                }
            } catch (Exception ex) {
                LOGGER.severe("Error: " + ex.getMessage());
                System.out.println("Error: " + ex.getMessage());
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Virtual Classroom Manager ---");
        System.out.println("1. Create Classroom");
        System.out.println("2. List Classrooms");
        System.out.println("3. Remove Classroom");
        System.out.println("4. Add Student to Classroom");
        System.out.println("5. List Students in Classroom");
        System.out.println("6. Schedule Assignment");
        System.out.println("7. Submit Assignment");
        System.out.println("0. Exit");
        System.out.print("Choose: ");
    }
}
