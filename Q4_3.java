import java.util.Scanner;

public class Q4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int xx = scanner.nextInt();
        int x = xx; //keep a copy
        
        int yy = scanner.nextInt();
        int y = yy; //keep a copy
        
        //first concrete check
        if(x == y) {
            System.out.print(yy + " = " + xx);
        } else {
        
            //let's reverse X, get the mod 3 times
            int reversedX3 = x%10;
            x = x / 10;
            int reversedX2 = x%10;
            x = x / 10;
            int reversedX1 = x%10;
            int reversedX = (reversedX3 * 100) + (reversedX2 * 10) + reversedX1;
            
            //let's reverse Y, get the mod 3 times
            int reversedY3 = y%10;
            y = y / 10;
            int reversedY2 = y%10;
            y = y / 10;
            int reversedY1 = y%10;
            int reversedY = (reversedY3 * 100) + (reversedY2 * 10) + reversedY1;
            
            //print to test
            //System.out.println(xx + " " + reversedX + " " + yy + " " + reversedY);
            
            if(reversedY > reversedX)
                System.out.print(xx + " < " + yy);
            else
                System.out.print(yy + " < " + xx);
        }
        scanner.close();
    }
}