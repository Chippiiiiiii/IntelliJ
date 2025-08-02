import java.util.Scanner;
public class Patient {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int age;
        int appointmentnumber;
        System.out.println("Enter your Age:-");
        age=inp.nextInt();
        if(age>=18 && age<=65)
        {
            System.out.println("Enter your Appointment number:-");
            appointmentnumber=inp.nextInt();
            if(appointmentnumber>=100 && appointmentnumber<=999) {
                if (appointmentnumber % 2==0) {
                    System.out.println("You Have assigned Priority slot");}
                else {
                    System.out.println("You have assigned Regular slot");}
                int last = appointmentnumber % 10;
                switch (last) {
                    case 1: System.out.println("Pen");
                        break;
                    case 2: System.out.println("Mask");
                        break;
                    case 3: System.out.println("Sanitizer");
                        break;
                    default: System.out.println("No gifts");}}
            else {
                System.out.println("Appointmet number must be 3 number");
            }}}}



