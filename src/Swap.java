import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tharun P 2024503579");
        System.out.println("Enter an string:");
        String a = input.nextLine();
        String b = "";
        char c;
        for (int i = 0; i < a.length(); i++) {
            c = a.charAt(i);
            b=c+b;
        }
        System.out.println(b);
    }
}