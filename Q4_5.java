import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long x1 = scanner.nextInt();
        long y1 = scanner.nextInt();
        
        long x2 = scanner.nextInt();
        long y2 = scanner.nextInt();
        
        long x3 = scanner.nextInt();
        long y3 = scanner.nextInt();
        
        long x4 = 0;
        long y4 = 0;
        
        /*
         * In this solution there is no difference in finding X or Y. There must be 
         * two equal numbers, so let's check one by one.
         *  
         * Assume we have a box of 4 parts,
         * 
         *          ------
         *          | x1 |
         *          ------
         *          | x2 |
         *          ------
         *          | x3 |
         *          ------
         *          | ?? |
         *          ------
         * 
         * Now it's easier to understand. 
         */
        
        //missing x
        if(x1 == x2)
            x4 = x3;
        else if(x1 == x3)
            x4 = x2;
        else
            x4 = x1;
        
        //missing y
        if(y1 == y2)
            y4 = y3;
        else if(y1 == y3)
            y4 = y2;
        else
            y4 = y1;
        
        System.out.print(x4 + " " + y4);
        
        scanner.close();
    }
}