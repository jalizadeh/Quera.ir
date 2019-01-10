import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int mv = scanner.nextInt();
        int mh = scanner.nextInt();
        int bv = scanner.nextInt();
        int bh = scanner.nextInt();
        
        if(mv == bv)
            System.out.print("Vertical");
        else if(mh == bh)
            System.out.print("Horizontal");
        else
            System.out.print("Try again");
        
        scanner.close();
    }
}