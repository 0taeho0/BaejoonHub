import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float max = 0;
		float [] arr = new float[scan.nextInt()];
		float sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i] / max * 100;
		}
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum / arr.length);
	}

}