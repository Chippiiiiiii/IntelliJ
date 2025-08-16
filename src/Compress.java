import java.util.Scanner;
class Compress {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Tharun P 2024503579");
        System.out.println("Enter an String:");
        String a= input.nextLine();
        char currentChar = a.charAt(0);
        int count = 1;
        String compressed = "";
        for (int i = 1; i < a.length(); i++) {
            char nextChar = a.charAt(i);
            if (nextChar == currentChar) {
                count++;
            } else {
                compressed = compressed + currentChar + count;
                currentChar = nextChar;
                count = 1;
            }
        }
        compressed = compressed + currentChar + count;
        if (compressed.length() < a.length()) {
            System.out.println("Compressed: " + compressed);
        } else {
            System.out.println("Compressed: " + a);
        }
    }
}