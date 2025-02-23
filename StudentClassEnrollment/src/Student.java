import java.util.ArrayList;
import java.util.Random;

public class Student {
    private int id;
    private String name;
    private Course course;
    private ArrayList<ModuleMark> moduleMarks;
    private static Random rand = new Random();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.course = null;
        this.moduleMarks = new ArrayList<>();
    }

    public void enroll(Course course) {
        this.course = course;
        moduleMarks.clear();
        for (Module module : course.getModules()) {
            moduleMarks.add(new ModuleMark(module, rand.nextInt(101))); // Random mark 0-100
        }
    }

    public void print() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        if (course != null) {
            System.out.println("Enrolled in:");
            course.print();
            System.out.println("Marks:");
            for (ModuleMark mm : moduleMarks) {
                Grade grade = mm.getModule().getLetterGrade(mm.getMark());
                System.out.println("  - " + mm.getModule().getModuleName() + ": " + mm.getMark() + " (" + grade + ")");
            }
        } else {
            System.out.println("Not enrolled in any course.");
        }
    }

    public ArrayList<ModuleMark> getModuleMarks() {
        return moduleMarks;
    }

    public String getName() {
        return name;
    }
}