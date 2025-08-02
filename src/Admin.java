import java.util.Scanner;
public class Admin {
    public static void main(String[] args)
    {
        int failcount=0;
        String username="Admin";
        String pass="Sissy";
        while(true) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter username:-");
            String a = input.nextLine();
            System.out.println("Enter your Password:-");
            String b = input.nextLine();
            if (a.equalsIgnoreCase(username)&& b.equalsIgnoreCase(pass)) {
                System.out.println("Login Successfully");
                break;

            } else {
                failcount++;
                System.out.println("Login failed:-" + failcount);

            }
        }

        System.out.println("No of  Failed attempts:-" + failcount);


    }}