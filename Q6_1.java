import java.util.Scanner;

public class Q6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        String line1 = scanner.next();
        String line2 = scanner.next();
        
        int miss = 0;       
        for(int i = 0; i< n ; i++) {
            if(line1.charAt(i) != line2.charAt(i))
                miss++;
        }
        
        System.out.println(miss);
        
        scanner.close();
    }
}