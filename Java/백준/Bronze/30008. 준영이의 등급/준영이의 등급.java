import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		int member = scan.nextInt(); 
		int num = scan.nextInt();
		int [] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			int A = scan.nextInt()*100/member;
			if(A < 5) arr[i] = 1;
			else if(A < 12) arr[i] = 2;
			else if(A < 24) arr[i] = 3;
			else if(A < 41) arr[i] = 4;
			else if(A < 61) arr[i] = 5;
			else if(A < 78) arr[i] = 6;
			else if(A < 90) arr[i] = 7;
			else if(A < 97) arr[i] = 8;
			else if(A < 101) arr[i] = 9;
			}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}