import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int count = 0;
		
		int [] arr = new int[9];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				count = i+1;
			}
		}
		System.out.print(max+"\n"+count);
 	}
}
