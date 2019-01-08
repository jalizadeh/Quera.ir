import java.util.Scanner;

public class Q3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        
        System.out.printf("Sum : %.6f\n", (double)(n1 + n2 + n3 + n4));
        System.out.printf("Average : %.6f\n", (double)(n1 + n2 + n3 + n4) / 4);
        System.out.printf("Product : %.6f\n", (double)(n1 * n2 * n3 * n4));
        System.out.printf("MAX : %.6f\n", (double)(Math.max(n1, Math.max(n2, Math.max(n3, n4)))));
        System.out.printf("MIN : %.6f\n", (double)(Math.min(n1, Math.min(n2, Math.min(n3, n4)))));
    }
}