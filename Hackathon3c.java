import java.util.Scanner;

public class Hackathon3c {
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste collected at Point 1 (kg): ");
        double point1 = sc.nextDouble();

        System.out.print("Enter waste collected at Point 2 (kg): ");
        double point2 = sc.nextDouble();

        double totalWaste = calculateTotalWaste(point1 , point2);

        System.out.println("Total Waste Collected: " + totalWaste + " kg");

        sc.close();
    }
}