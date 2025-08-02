import java.util.Scanner;
class Temp
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter temp in celsius:");
        double celsius=input.nextDouble();
        double fahren=(celsius*9/5)+32;
        boolean hot=fahren>100;
        System.out.println("Temperature:"  +celsius+"C"+fahren+"F");
        System.out.println("Hot:"+hot);
    }
}
