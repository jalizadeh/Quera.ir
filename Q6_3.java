import java.util.Scanner;

public class Q6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] array = new int[101]; //I wont use array[0]

        //I +1 each block of the array which is equal to the input
        for(int i=1; i<= n ; i++) {
            array[scanner.nextInt()]++;
        }
        
        /*
        for(int i=1; i<= n ; i++) {
            System.out.println(i + " -> " + array[i]);
        }
        */
        
        /*
         * I assume that always the first item in the array is the smallest
         * but first, I have to find it & it's location
         */
        int min = 0; //0 is dummy value, it will be filled
        int min_index = 1; //1 is dummy value, it will be filled
        for(int i=1; i<= 100; i++) {
            if(array[i] != 0) {
                min = array[i];
                min_index = i;
                break;
            }
        }
    
        //Now, let's find the min 
        for(int i=1; i<= 100 ; i++) {
            if(array[i] < min && array[i] != 0) {
                min = array[i];
                min_index = i;
            }
        }
        
        System.out.println(min_index);
        
        scanner.close();
    }
}