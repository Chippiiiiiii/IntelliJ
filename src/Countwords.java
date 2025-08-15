import java.util.Scanner;
public class Countwords {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int count=0;
        System.out.println("Enter an String:-");
        String a=input.nextLine();
        String[] arr= a.split(" ");
        for (String b:arr)
        {
            System.out.println(b);
            count++;
        }
        System.out.println(count);
    }
}
 