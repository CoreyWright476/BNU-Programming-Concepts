import java.util.Scanner;

public class Week2 {

    static Scanner sc = new Scanner(System.in);

    public static void gradeConvertedToUniDegree() {

        System.out.println("\n Lets convert your grade to a university classification!");
        System.out.println("Enter your grade: ");

        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'A' -> System.out.println("First class");
            case 'B' -> System.out.println("2:1");
            case 'C' -> System.out.println("2:2");
            case 'D' -> System.out.println("Third class");
            case 'E' -> System.out.println("Ordinary");
            case 'U' -> System.out.println("Fail");
        }
    }

    public static void printOneToNine() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void printTimesTable() {

        char response;

        do {
            System.out.println("Enter a number to see its time table:");
            int num = sc.nextInt();

            for (int i = 1; i < 13; i++) {
                System.out.println(num + " x " + i + " = " + num * i);
            }
            System.out.println("\n Do you want to try another times table? (Y/N)");
            response = sc.next().charAt(0);

        } while (response != 'N');
        System.out.println("Goodbye!");
    }

    public static void enterMarkReturnGrade() {

        System.out.println("Enter your mark(0-100) : ");
        int mark = sc.nextInt();

        if (mark >= 70) {
            System.out.println("Grade: A");
        } else if (mark >= 60) {
            System.out.println("Grade: B");
        } else if (mark >= 50) {
            System.out.println("Grade: C");
        } else if (mark >= 40) {
            System.out.println("Grade: D");
        } else if (mark >= 30) {
            System.out.println("Grade: E");
        } else
            System.out.println("Grade: U");
    }

    public static void printEvenNumbers() {

        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
