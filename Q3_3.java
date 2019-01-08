import java.util.Scanner;

public class Q3_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);       
        int n = scanner.nextInt();
        
        /*
        The square may have the most sections inside, if only
        the number of rows & columns be high & close as much.
        
        So, divide the input by 2, pick the result as ROW, then
        get the remainder as COLUMN.
        */
        
        //n = 3
        int row = n / 2; //1
        int col = (n % 2) + row; //1 + 1
        
        //Each line divide the main square by 2, so +1 must be added to each one. 
        System.out.print((row + 1) * (col + 1));
    }
}