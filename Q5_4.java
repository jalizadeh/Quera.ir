import java.util.Scanner;

public class Q5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        
        int counter = 0;
        
        /*
         * I need to calculate the possible for each part
         * but only, the pairs which are valid
         * 
         * NOTE: at the end, sum of the pair can not exceed "x"
         */
        for(int i = 1; i<=a; i++) 
            if(a % i == 0) 
                for(int j = 1; j <= b; j++) 
                    if(b % j == 0)
                        if(i + j <= x)
                            counter++;
        
        System.out.print(counter);
        
        scanner.close();
    }
}