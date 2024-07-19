import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int [] arr = new int[scan.nextInt()];
    	
    	
    	
    	for(int i=0; i < arr.length; i++) {
    		int A = scan.nextInt();
        	int B = scan.nextInt();
        	int C = scan.nextInt();
        	arr[i] = A*(C-1)+B;
        	System.out.println(arr[i]);
    	}
    }
}