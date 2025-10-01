import java.util.*;
import java.util.logging.*;

public class VirtualClassroomManager {
    private static final Logger LOGGER = Logger.getLogger(VirtualClassroomManager.class.getName());
    private static VirtualClassroomManager instance;
    private final Map<String, Classroom> classrooms;

    private VirtualClassroomManager() {
        classrooms = new HashMap<>();
    }

    // Singleton accessor
    public static synchronized VirtualClassroomManager getInstance() {
        if (instance == null) {
            instance = new VirtualClassroomManager();
        }
        return instance;
    }

    public synchronized void createClassroom(String name) throws InvalidOperationException {
        validateName(name);
        if (classrooms.containsKey(name)) {
            throw new InvalidOperationException("Classroom already exists: " + name);
        }
        Classroom c = new Classroom(name);
        classrooms.put(name, c);
        LOGGER.info("Classroom [" + name + "] has been created.");
        System.out.println("Classroom [" + name + "] has been created.");
    }

    public synchronized void removeClassroom(String name) throws ClassroomNotFoundException {
        if (!classrooms.containsKey(name)) {
            throw new ClassroomNotFoundException("No such classroom: " + name);
        }
        classrooms.remove(name);
        LOGGER.info("Classroom [" + name + "] removed.");
        System.out.println("Classroom [" + name + "] removed.");
    }

    public synchronized void listClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms present.");
            return;
        }
        System.out.println("Classrooms:");
        for (String key : classrooms.keySet()) {
            System.out.println("- " + key);
        }
    }

    public synchronized Classroom getClassroom(String name) throws ClassroomNotFoundException {
        Classroom c = classrooms.get(name);
        if (c == null)
            throw new ClassroomNotFoundException("Classroom not found: " + name);
        return c;
    }

    private void validateName(String name) throws InvalidOperationException {
        if (name == null || name.trim().isEmpty())
            throw new InvalidOperationException("Invalid classroom name");
    }
}
