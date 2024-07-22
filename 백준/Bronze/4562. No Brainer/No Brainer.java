import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int []arr = new int[scan.nextInt()*2];
        
        for(int i=0; i<arr.length; i++) {
        	arr[i] = scan.nextInt();
        }
        for(int i=0; i<arr.length; i+=2) {
        	if(arr[i]<arr[i+1]) {
        		System.out.println("NO BRAINS");
        	} else {
        		System.out.println("MMM BRAINS");
        	}
        }
    } 
}