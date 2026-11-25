import java.util.Scanner;

public class HourlyCalc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("What your hourly rate? ");
    double Hrate = sc.nextDouble();

    System.out.print("How many work days per week? ");
    int Wdays = sc.nextInt();

    System.out.print("How many weeks? ");
    int weeks = sc.nextInt();

    int week = 1;
    while (week <= weeks) {
        System.out.println("Week " + week);

        int dayCount = 1;
        while (dayCount <= Wdays) {
            System.out.print("How many hours for day " + dayCount + "? ");
            double Hday = sc.nextDouble();
            double payday = Hrate * Hday;
            System.out.printf("Your earnings on Day %d is: %.2f%n", dayCount, payday);
            dayCount++;
        }

        week++;
    }
    
  }
}