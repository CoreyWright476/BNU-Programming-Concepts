public class Course {

    private String courseCode;

    private String courseName;

    public Course(String courseCode, String courseName){

        this.courseCode = courseCode;
        this.courseName = courseName;

    }

    public void print(){

        System.out.println("The course code is: " + courseCode);
        System.out.println("The course name is: " + courseName);

    }



}
