import java.util.Scanner;

public class Q3_2 {
	public static void main(String[] args) {
		final int SHAH = 1;
		final int VAZIR = 1;
		final int ROKH = 2;
		final int FIL = 2;
		final int ASB = 2;
		final int SARBAZ = 8;
		
		Scanner scanner = new Scanner(System.in);       
        int shah = scanner.nextInt();
        int vazir = scanner.nextInt();
        int rokh = scanner.nextInt();
        int fil = scanner.nextInt();
        int asb = scanner.nextInt();
        int sarbaz = scanner.nextInt();
        
		System.out.print((SHAH - shah) + " "
							+ (VAZIR - vazir) + " "
							+ (ROKH - rokh) + " "
							+ (FIL - fil) + " "
							+ (ASB - asb) + " "
							+ (SARBAZ - sarbaz));

	}
}