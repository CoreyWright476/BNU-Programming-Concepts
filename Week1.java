import java.util.Scanner;

public class Week1 {

    static Scanner sc = new Scanner(System.in);

    public static void greeting() {

        System.out.println("Please enter your name: ");

        String name = sc.nextLine();

        System.out.println("Nice to meet you, " + name + "!");
    }

    public static void calculationOfRectangle(){

        System.out.println("\nEnter the length of the rectangle(cm): ");
        int length = sc.nextInt();

        System.out.println("Enter the width of the rectangle(cm): ");
        int width = sc.nextInt();

        int perimeter = 2 * (length + width);
        int area = length * width;

        System.out.println("The perimeter of the rectangle is: " + perimeter + "cm");
        System.out.println("The area of the rectangle is: " + area + "cm^2");
    }

    public static void averageOfTwoNums() {

        System.out.println("\nLet's calculate the average of two numbers!");
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        double average = (num1 + num2) / 2.0;

        System.out.println("The average of the two numbers is: " + average);
    }

    public static void outputOriginalOrderThenReversed() {

        System.out.println("\nLet's output two numbers in their original order and then in reversed order!");
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("The original order is: " + num1 + " " + num2);
        System.out.println("The reversed order is: " + num2 + " " + num1);
    }

    public static void estimateDOB() {

        System.out.println("\nLet's estimate your year of birth!");
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter the current year: ");
        int currentYear = sc.nextInt();

        int estimatedYearOfBirth = currentYear - age;

        System.out.println("Your estimated year of birth is: " + estimatedYearOfBirth);
    }

    public static void estimateAgeInDaysUsingDDMMYYYY() {

        System.out.println("\nLet's estimate your age in days using your date of birth!");
        System.out.println("Enter the day of your birth: ");
        int day = sc.nextInt();
        int oldEnough = 18 * 365;

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

        if (ageInDays >= oldEnough) {
            System.out.println("You are 18 or older");
        } else {
            System.out.println("You are under 18");
        }
    }

    public static void convertFeetToMiles() {

        System.out.println("\nLet's convert feet to miles!");
        System.out.println("Enter the number of feet: ");
        int feet = sc.nextInt();

        double miles = feet / 5280.0;

        System.out.println(feet + " feet is equal to " + miles + " miles.");
    }

    public static void calculateInterestInvested() {

        System.out.println("\nLet's calculate the interest on an investment!");
        System.out.println("Enter the deposit amount: ");
        double deposit = sc.nextDouble();

        System.out.println("With an interest rate of 1%, the interest on the deposit after one year is: " + deposit * 0.01);
    }

}
