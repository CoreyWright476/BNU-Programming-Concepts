public class Student {

    private int id;

    private String name;

    Course course;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.course = null;
    }

    public void enroll(Course course) {
        this.course = course;
    }

    public void print() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        if (course != null) {
            System.out.println("Enrolled in:");
            course.print();
        } else {
            System.out.println("Not enrolled in any course.");
        }
    }

}
