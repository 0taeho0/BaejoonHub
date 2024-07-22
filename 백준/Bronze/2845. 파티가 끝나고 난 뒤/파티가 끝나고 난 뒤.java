import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int L = scan.nextInt();
    	int P = scan.nextInt();
    	
    	int [] arr = {scan.nextInt(),
		    			scan.nextInt(),
		    			scan.nextInt(),
		    			scan.nextInt(),
		    			scan.nextInt()};
    	
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] == 0){
    			arr[i] = arr[i] - L*P;
    		}else if(arr[i] >= L*P) {
    			arr[i] = arr[i] - L*P; 
    		}else if(arr[i] <= L*P) {
    			arr[i] = arr[i] - L*P;
    		}
    	}
    	for(int i=0; i<arr.length; i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
}