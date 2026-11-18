import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== STUDENT GRADE EVALUATION =====");
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Mathemathics Grade: ");
        double mathGrade = scanner.nextDouble();

        System.out.print("Enter Science Grade: ");
        double scienceGrade = scanner.nextDouble();

        System.out.print("Enter English Grade: ");
        double englishGrade = scanner.nextDouble();

        System.out.print("Enter History Grade: ");
        double historyGrade = scanner.nextDouble();

        double averageGrade = (mathGrade + scienceGrade + englishGrade + historyGrade) / 4;

        if (mathGrade < 0 || mathGrade > 100 || scienceGrade < 0 || scienceGrade > 100 ||
            englishGrade < 0 || englishGrade > 100 || historyGrade < 0 || historyGrade > 100) {
            System.out.println("Error: Grades must be between 0 and 100.");
            return;
        }

        String overallGrade;
        String overallDescription;
        String Status;

        if (averageGrade >= 90) {
            overallGrade = "A";
            overallDescription = "Excellent";
            Status = "Pass";

        } else if (averageGrade >= 80) {
            overallGrade = "B";
            overallDescription = "Good";
            Status = "Pass";
        } else if (averageGrade >= 75) {
            overallGrade = "C";
            overallDescription = "Average";
            Status = "Pass";
        } else if (averageGrade >= 60) {
            overallGrade = "D";
            overallDescription = "Below Average";
            Status = "Fail";
        } else {
            overallGrade = "F";
            overallDescription = "Fail";
            Status = "Fail";
        }

        System.out.println("\n===== GRADE INFORMATION =====");
        System.out.printf("Student Name: %s\n", name);
        System.out.printf("Mathematics Grade: %.2f\n", mathGrade);
        System.out.printf("Science Grade: %.2f\n", scienceGrade);
        System.out.printf("English Grade: %.2f\n", englishGrade);
        System.out.printf("History Grade: %.2f\n", historyGrade);
        System.out.printf("Average Grade: %.2f\n", averageGrade);
        System.out.printf("Overall Grade: %s\n", overallGrade);
        System.out.printf("Overall Description: %s\n", overallDescription);
        System.out.printf("Status: %s\n", Status);

        scanner.close();
    }
}
