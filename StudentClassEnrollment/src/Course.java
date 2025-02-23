import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private ArrayList<Module> modules;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.modules = new ArrayList<>();
        // Add four modules
        modules.add(new Module("Introduction to Java", "IJ101"));
        modules.add(new Module("Object-Oriented Programming", "OOP202"));
        modules.add(new Module("Data Structures", "DS303"));
        modules.add(new Module("Algorithms", "ALG404"));
    }

    public void print() {
        System.out.println("The course code is: " + courseCode);
        System.out.println("The course name is: " + courseName);
        System.out.println("Modules:");
        for (Module module : modules) {
            System.out.println("  - " + module.getModuleName() + " (" + module.getModuleCode() + ")");
        }
    }

    public ArrayList<Module> getModules() {
        return modules;
    }
}