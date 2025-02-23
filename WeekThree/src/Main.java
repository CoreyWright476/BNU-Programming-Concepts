public class Main {

    public static void main(String[] args) {

        Student corey = new Student(22402039, "Corey Wright");
        Student dawson = new Student(22402039, "Dawson Wright");
        Student jordann = new Student(756790, "Jordann Wright");

        Course maths = new Course("Mth123", "Maths");
        Course english = new Course("Englsh123", "English");

        corey.print();
        dawson.print();
        jordann.print();

        maths.print();
        english.print();



    }
}