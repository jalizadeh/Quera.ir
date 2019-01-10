import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		char c1 = input.charAt(0);
		char c2 = input.charAt(1);
		char c3 = input.charAt(2);
		char c4 = input.charAt(3);
		char c5 = input.charAt(4);
        
        int g = 0;
        int y = 0;
        int r = 0;
        
        if(c1 == 'G') g++;
        else if (c1 == 'Y') y++;
        else r++;
        
        if(c2 == 'G') g++;
        else if (c2 == 'Y') y++;
        else r++;

        if(c3 == 'G') g++;
        else if (c3 == 'Y') y++;
        else r++;

        if(c4 == 'G') g++;
        else if (c4 == 'Y') y++;
        else r++;

        if(c5 == 'G') g++;
        else if (c5 == 'Y') y++;
        else r++;
        
        if( r >=3 || (y >= 2 && r >=2) || g == 0)
        	System.out.print("nakhor lite");
        else
        	System.out.print("rahat baash");
        
        scanner.close();
    }
}