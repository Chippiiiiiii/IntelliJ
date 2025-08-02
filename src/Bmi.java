import java.util.Scanner;
public class Bmi {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your wieght:_");
        double wieght=input.nextDouble();
        System.out.println("Enter your Height:-");
        double height=input.nextDouble();
        double bmi=wieght/(height*height);
        boolean normal=bmi>=18.5 && bmi<=25;
        System.out.println("Bmi:-"+bmi);
        System.out.println("Bmi Normal:-"+normal);


    }

}
