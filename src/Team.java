import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter team runs: ");
        int runs = input.nextInt();
        System.out.print("Enter number of fouls: ");
        short fouls = input.nextShort();
        boolean winStatus = (runs >= 50) && (fouls <= 5);
        System.out.println("Fouls: " + fouls);
        System.out.println("Win Status: " + winStatus);
    }
}