import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        greeting();
        calculationOfRectangle();
        averageOfTwoNums();
        outputOriginalOrderThenReversed();
        estimateDOB();
        estimateAgeInDaysUsingDDMMYYYY();
        convertFeetToMiles();
        calculateInterestInvested();
    }

    private static void greeting() {
        System.out.println("Please enter your name: ");

        String name = sc.nextLine();

        System.out.println("Nice to meet you, " + name + "!");
    }

    private static void calculationOfRectangle(){

        System.out.println("Enter the length of the rectangle(cm): ");
        int length = sc.nextInt();

        System.out.println("Enter the width of the rectangle(cm): ");
        int width = sc.nextInt();

        int perimeter = 2 * (length + width);
        int area = length * width;

        System.out.println("The perimeter of the rectangle is: " + perimeter + "cm");
        System.out.println("The area of the rectangle is: " + area + "cm^2");
    }

    private static void averageOfTwoNums() {
        System.out.println("Let's calculate the average of two numbers!");
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        double average = (num1 + num2) / 2.0;

        System.out.println("The average of the two numbers is: " + average);
    }

    private static void outputOriginalOrderThenReversed() {
        System.out.println("Let's output two numbers in their original order and then in reversed order!");
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("The original order is: " + num1 + " " + num2);
        System.out.println("The reversed order is: " + num2 + " " + num1);
    }

    private static void estimateDOB() {
        System.out.println("Let's estimate your year of birth!");
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter the current year: ");
        int currentYear = sc.nextInt();

        int estimatedYearOfBirth = currentYear - age;

        System.out.println("Your estimated year of birth is: " + estimatedYearOfBirth);
    }

    private static void estimateAgeInDaysUsingDDMMYYYY() {
        System.out.println("Let's estimate your age in days using your date of birth!");
        System.out.println("Enter the day of your birth: ");
        int day = sc.nextInt();

        System.out.println("Enter the month of your birth: ");
        int month = sc.nextInt();

        System.out.println("Enter the year of your birth: ");
        int year = sc.nextInt();

        System.out.println("Enter the current day: ");
        int currentDay = sc.nextInt();

        System.out.println("Enter the current month: ");
        int currentMonth = sc.nextInt();

        System.out.println("Enter the current year: ");
        int currentYear = sc.nextInt();

        int ageInDays = (currentYear - year) * 365 + (currentMonth - month) * 30 + (currentDay - day);

        System.out.println("Your age in days is: " + ageInDays);
    }

    private static void convertFeetToMiles() {
        System.out.println("Let's convert feet to miles!");
        System.out.println("Enter the number of feet: ");
        int feet = sc.nextInt();

        double miles = feet / 5280.0;

        System.out.println(feet + " feet is equal to " + miles + " miles.");
    }

    private static void calculateInterestInvested() {
        System.out.println("Let's calculate the interest on an investment!");
        System.out.println("Enter the deposit amount: ");
        double deposit = sc.nextDouble();

        System.out.println("With an interest rate of 1%, the interest on the deposit after one year is: " + deposit * 0.01);
    }
}
