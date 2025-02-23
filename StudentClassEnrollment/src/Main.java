public class Main {

    public static void main(String[] args) {

        Student corey = new Student(22402039, "Corey Wright");
        Student dawson = new Student(22402039, "Dawson Wright");
        Student jordann = new Student(756790, "Jordann Wright");

        Course course = new Course("Java Programming", "Java Programming is a programming language");

        corey.print();
        dawson.print();
        jordann.print();

        System.out.println("Before Enrollment: ");
        System.out.println("-----");
        corey.print();

        corey.enroll(course);

        System.out.println("-----");
        System.out.println("After Enrollment: ");
        corey.print();

    }
}