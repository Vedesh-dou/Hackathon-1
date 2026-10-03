import java.util.Scanner;
    public class Hackathon3b {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the total waste collected");
            double wasteCollected = sc.nextDouble();

            if (wasteCollected < 100){
                System.out.println("More Waste should be collected");
            }
            else if (wasteCollected > 100 && wasteCollected <= 300){
                System.out.println("Waste collection has reached the limit");
            }
            else if (wasteCollected > 300){
                System.out.println("OVERLOAD MUST BE DUMPED IMMEADETELY");
            }
        sc.close();
        }

    }