import java.util.Scanner;
public class Matrix{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] mat = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                mat[i][j] = input.nextInt();
        calcRowSums(mat);
    }
    static void calcRowSums(int[][] mat) {
        int maxSum = 0, rowNum = 0;
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++)
                sum += mat[i][j];
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
            if (sum > maxSum) {
                maxSum = sum;
                rowNum = i + 1;
            }
        }
        System.out.println("Row with highest sum: " + rowNum);
    }
}