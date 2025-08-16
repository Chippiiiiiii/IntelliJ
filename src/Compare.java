import java.util.*;
public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tharun P 2024503579");
        System.out.println("Enter an string:-");
        String a = input.nextLine();
        System.out.println("Enter an String:-");
        String b = input.nextLine();
        String[] c = a.split("\\.");
        String[] d = b.split("\\.");
        for (int i = 0; i < Math.min(c.length, d.length); i++) {
            int e = c[i].compareTo(d[i]);
            if (e > 0) {
                System.out.println(a + " is bigger");
                return;
            } else if (e < 0) {
                System.out.println(b + " is bigger");
                return;
            }
        }
        if (c.length > d.length) {
            System.out.println(a + " is bigger");
        } else if (c.length < d.length) {
            System.out.println(b + " is bigger");
        } else {
            System.out.println("Both are equal");
        }
    }
}