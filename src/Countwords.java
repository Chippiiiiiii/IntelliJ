import java.util.Scanner;
public class Countwords {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Tharun P 2024503579");
        int count=0;
        System.out.println("Enter an String:-");
        String a=input.nextLine();
        String[] arr= a.split(" ");
        for (String b:arr)
        {
            count++;
        }
        System.out.println("No of Words:-"+count);
    }
}
 