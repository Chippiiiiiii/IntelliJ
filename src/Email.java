import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        System.out.println("Tharun P 2024503579");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email address:");
        String email = sc.nextLine();
        int atCount = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                atCount++;
            }
        }
        if (atCount != 1) {
            System.out.println("Invalid email: must contain exactly one '@'");
            return;
        }
        String[] parts = email.split("@");
        String username = parts[0];
        String domain = parts[1];
        if (username.length() != 25) {
            System.out.println("Invalid email: username must be exactly 25 characters");
            return;
        }
        if (!username.matches("[a-zA-Z0-9_\\-+]+")) {
            System.out.println("Invalid email: username contains invalid characters");
            return;
        }
        if (!(domain.endsWith(".com") || domain.endsWith(".in") || domain.endsWith(".edu"))) {
            System.out.println("Invalid email: domain must end with .com, .in, or .edu");
            return;
        }
        System.out.println("Valid email");
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
    }
}