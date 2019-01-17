import java.util.Scanner;

public class Q5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xx = scanner.nextInt();
        int yy = scanner.nextInt();
        
        int x =0;
        int y =0;
        boolean found = false;
        
        //the pattern repeats any 4 moves and in each move, changes differently
        for(int i = 0; i< xx + yy; i++) {
            if(i % 4 == 0) {
                x++;
                y++;
            } else if( i % 4 == 1) {
                x++;
                y--;
            } else if( i % 4 == 2) {
                x++;
                y++;
            } else if( i % 4 == 3) {
                x--;
                y++;
            }
            
            //found? break the loop & finish the app
            if(x == xx && y == yy) {
                System.out.println(i+1);
                found = true;
                break;
            }
        }
        
        if(!found)
            System.out.println(-1);
        
        scanner.close();
    }
}