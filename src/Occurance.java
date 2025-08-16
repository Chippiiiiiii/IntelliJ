import java.util.Scanner;
public class Occurance {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Tharun P 2024503579");
        System.out.println("enter an string:");
        String a=input.nextLine();
        a=a.toLowerCase();
        int[] arr=new int[26];
        for(int i=0;i<a.length();i++) {
            char ch = a.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a']++;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]>0)
            {
                char lit=(char) (i+'a');
                System.out.println(lit+"="+arr[i]);
            }
        }
    }
}