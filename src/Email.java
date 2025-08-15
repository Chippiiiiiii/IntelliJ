import java.util.*;
public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an email: ");
        String email = sc.nextLine().trim();

        if (email.indexOf('@') == -1 ) {
            System.out.println("Invalid Email\nNo @ Symbol is Used ");
            return;
        }
        if(email.indexOf('@') != email.lastIndexOf('@')) {
            System.out.println("Invalid Email\nOnly one @ Symbol should be used");
            return;
        }

        if (email.matches("[a-zA-Z0-9_!@#$%^&*><?]{1,25}") &&
                (email.endsWith(".com") || email.endsWith(".in") || email.endsWith(".edu"))) {

            System.out.println("Valid Email-ID");
            System.out.println("Email ID:"+email);
        } else if(email.length()>25) {
            System.out.println("It should be less than 25 characters");
        }
        System.out.println("Invalid Email ");
        }
    }


