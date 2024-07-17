import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		String [] arr = new String[T];
		String [] arr2 = new String[T];
		for(int i=0; i < arr.length; i++) {
			arr[i] = scan.next();
		}
		
		for(int i=0; i < arr.length; i++) {
			arr2[i] = arr[i].substring(0,1)+arr[i].substring(arr[i].length()-1,arr[i].length());
		}
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr2[i]);
		}
 	}
}