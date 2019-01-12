import java.util.Scanner;

public class Q5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        
        //solution #1
        /*
        long sum = 0;
        while(n >= 10) {
            sum = 0;
            while(n > 0) {
                sum = sum + (n%10);
                n = n / 10;
            }
            n = sum;
        }
        
        System.out.print(n);
        */
        
        //solution #2
        n = n % 9;
        if(n == 0)
            System.out.println("9");
        else
            System.out.println(n);
        
        scanner.close();
    }
}