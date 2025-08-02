import java.util.Scanner;
public class Scientific{
    public static void main(String[] args)
    {
        double a,b,result;
        Scanner input=new Scanner(System.in);
        System.out.println("---Menu---\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Trigonometric Operations");
        System.out.println("Enter Your choice:-");
        int c;
        c = input.nextInt();
        switch(c)
        {
            case 1:
                System.out.println("Enter Number1:-");
                a= input.nextDouble();
                System.out.println("Enter Number2:-");
                b= input.nextDouble();
                result=a+b;
                System.out.println("The sum:-"+result);
                break;
            case 2:
                System.out.println("Enter Number1:-");
                a = input.nextDouble();
                System.out.println("Enter Number2:-");
                b = input.nextDouble();
                result= a-b;
                System.out.println("The difference:-"+result);
                break;
            case 3:
            { System.out.println("Enter Number1:-");
                a = input.nextDouble();
                System.out.println("Enter Number2:-");
                b = input.nextDouble();
                result=a*b;
                System.out.println("The product:-"+result);
                break;}
            case 4: {
                System.out.println("Enter Number1:-");
                a = input.nextDouble();
                System.out.println("Enter Number2:-");
                b= input.nextDouble();
                if (b != 0) {
                    result=a/b;
                    System.out.println("The Division:-" + result);
                } else {
                    System.out.println("Division by zero isn't Possible");
                }
                break;
            }
            case 5:
                System.out.println("Enter your angle in degrees:-");
                a= input.nextDouble();
                b=Math.toRadians(a);
                double sin=Math.sin(b);System.out.printf("Sin(%.2f°) = %.4f\n", a,sin);
                double cos=Math.cos(b);System.out.printf("cosec(%.2f°) = %.4f\n",a,cos);
                double tan=Math.tan(b);System.out.printf("Tan(%.2f°) = %.4f\n",a,tan);
                if(tan!=0) {double cot=1.0/tan; System.out.printf("cot(%.2f°) = %.4f\n", a, cot);}
                if(cos!=0) {double sec=1.0/cos; System.out.printf("sec(%.2f°) = %.4f\n", a,sec);}
                if(sin!=0) {double cosec=1.0/sin; System.out.printf("cosec(%.2f°) = %.4f\n",a, cosec);}
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

}
