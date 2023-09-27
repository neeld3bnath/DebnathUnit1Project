import java.util.Scanner;

public class TipCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Total bill input
        System.out.println("Enter the total bill:");
        double totalBill = scanner.nextDouble();

        //Tip percentage input
        System.out.println("Enter the tip percentage:");
        double tipPercentage = scanner.nextDouble();

        //Number of people input
        System.out.println("Enter the number of people:");
        int numberOfPeople = scanner.nextInt();

        double totalTip = totalBill * (tipPercentage / 100); //total tip
        double totalBillWithTip = totalBill + totalTip; //bill+tip
        double totalPerPerson = totalBillWithTip / numberOfPeople; //total per person

        System.out.printf("Total tip: $%.2f%n", totalTip);
        System.out.printf("Total bill including tip: $%.2f%n", totalBillWithTip);
        System.out.printf("Total per person: $%.2f%n", totalPerPerson);
    }
}
