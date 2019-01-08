import java.util.Scanner;

public class Q3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        
        System.out.printf("%02d:%02d",(12-h) % 12 ,(60 - m) % 60);
        scanner.close();
    }
}