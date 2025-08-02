import java.util.Scanner;
class Grade
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter marks for subject 1: ");
        double subject1 = input.nextDouble();
        System.out.print("Enter marks for subject 2: ");
        double subject2 = input.nextDouble();
        System.out.print("Enter marks for subject 3: ");
        double subject3 = input.nextDouble();
        double total = subject1 + subject2 + subject3;
        double avg = total / 3;
        boolean passStatus = (subject1 >= 50) && (subject2 >= 50) && (subject3 >= 50);

        char grade;
        if (subject1 < 50 || subject2 < 50 || subject3 < 50)
        {
            grade = 'U';
        } else {
            if (avg >= 90)
            {
                grade = 'S';
            }
            else if (avg >= 80)
            {
                grade = 'A';
            }
            else if (avg>= 70)
            {
                grade = 'B';
            }
            else if (avg>= 60)
            {
                grade = 'C';
            }
            else if (avg >= 50)
            {
                grade = 'D';
            }
            else {
                grade = 'U';
            }
        }
        System.out.println("Total marks: " + total);
        System.out.printf("Average marks: %.2f\n", avg);
        System.out.println("Grade: " + grade);
        System.out.println("Pass Status: " + passStatus);
    }
}
