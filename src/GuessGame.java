import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args)
    {
        int a=50,totalGuess=0,totalGames=0,b,c;
        Scanner input=new Scanner(System.in);

        outer  : while(true)
        {
            System.out.println("---Menu---\n1.Play Game\n2.View Status\n3.Quit");
            c = input.nextInt();
            switch(c)
            {
                case 1:
                    for(int i=1;i<11;i++)
                    {
                        System.out.println("Enter your Guess:");
                        b=input.nextInt();
                        if(b==-1)  continue outer;
                        if(b>=1 && b<=100)
                        {    if(b==a)
                        {
                            System.out.println("Your Have guessed correctly");
                            totalGuess++;
                            break ;
                        }
                        else {
                            System.out.println("Invalid guess");
                            if (b < a) {
                                System.out.println("Lower than secret number");totalGuess++;
                            } else {
                                System.out.println("Greater than the secret Number");totalGuess++;
                            }
                        }}}
                    totalGames++;
                    break;
                case 2:
                    if(totalGames==0) { System.out.println("NO game has been Player");}
                    System.out.println("Total games:"+totalGames);
                    System.out.println("TOtal guess:"+totalGuess);
                    System.out.println("Average guess:"+totalGuess/totalGames);
                    break;
                case 3:
                    System.out.println("Exiting---");
                    break outer;
                default:
                    System.out.print("Invalid choice");

            }}
    }
}






