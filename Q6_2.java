import java.util.Scanner;

public class Q6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] array = new int[n][n];
        for(int i=0; i< n; i++) {
            for(int j=0; j<n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        
        int sum = 0;
        for(int x=0; x < m; x++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            sum = sum + array[x1-1][y1-1];
        }
        
        System.out.print(sum);
        
        scanner.close();
    }
}