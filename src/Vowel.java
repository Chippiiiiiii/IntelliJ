import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String b = input.nextLine();
        b = b.toLowerCase();
        char[]  h= b.toCharArray();
        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
        for (char f : h) {
            switch (f) {
                case 'a': aCount++; break;
                case 'e': eCount++; break;
                case 'i': iCount++; break;
                case 'o': oCount++; break;
                case 'u': uCount++; break;
            }
        }
        System.out.println("a: " + aCount);
        System.out.println("e: " + eCount);
        System.out.println("i: " + iCount);
        System.out.println("o: " + oCount);
        System.out.println("u: " + uCount);
    }
}