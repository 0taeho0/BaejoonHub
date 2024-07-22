import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int [][] arr = new int[9][9];
    	int max = 0;
    	int A = 0;
    	int B = 0;
    	
    	for(int i=0; i < arr.length; i++) {
    		for(int j=0; j < arr.length; j++) {
    			arr[i][j] = scan.nextInt();
    			if(max <= arr[i][j]) {
    				max = arr[i][j];
    				A = i+1;
    				B = j+1;
    			}
    		}
    	}
    	System.out.println(max);
    	System.out.print(A + " " + B);
    }
}