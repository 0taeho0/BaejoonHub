import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int [] arr = {scan.nextInt(), scan.nextInt(), scan.nextInt()};
    	int temp = 0;
    	
    	for(int i=0; i<arr.length-1; i++) {
    		if(arr[i] > arr[i+1]) {
    			temp = arr[i+1];
    			arr[i+1] = arr[i];
    			arr[i] = temp;
    		}
    	}
    	for(int i=0; i<arr.length-1; i++) {
    		if(arr[i] > arr[i+1]) {
    			temp = arr[i+1];
    			arr[i+1] = arr[i];
    			arr[i] = temp;
    		}
    	}
    	for(int i=0; i<3; i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
}