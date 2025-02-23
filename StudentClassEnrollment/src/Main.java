import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(22402039, "Corey Wright"));
        students.add(new Student(22402040, "Dawson Wright"));
        students.add(new Student(756790, "Jordann Wright"));

        // Create and enroll in course
        Course course = new Course("CS101", "Java Programming");
        for (Student student : students) {
            student.enroll(course);
            student.print();
            System.out.println("-----");
        }

        // Calculate descriptive statistics
        int minMark = Integer.MAX_VALUE;
        int maxMark = Integer.MIN_VALUE;
        double totalSum = 0;
        int totalCount = 0;
        Student minStudent = null;
        Student maxStudent = null;

        for (Student student : students) {
            for (ModuleMark mm : student.getModuleMarks()) {
                int mark = mm.getMark();
                totalSum += mark;
                totalCount++;
                if (mark < minMark) {
                    minMark = mark;
                    minStudent = student;
                }
                if (mark > maxMark) {
                    maxMark = mark;
                    maxStudent = student;
                }
            }
        }
        double meanMark = totalSum / totalCount;

        // Print statistics
        System.out.println("Descriptive Statistics:");
        System.out.println("Minimum Mark: " + minMark + " (Student: " + minStudent.getName() + ")");
        System.out.println("Maximum Mark: " + maxMark + " (Student: " + maxStudent.getName() + ")");
        System.out.printf("Mean Mark: %.2f%n", meanMark);
    }
}