import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.nextLine();
        String[] arr1 = A.split(" ");

        int[] arr2 = new int[arr1.length];

        for(int i = 0; i < arr1.length; i++) {
        	arr2[i] = Integer.parseInt(arr1[i]);
        }
        int count = 0;
        for(int i=0; i<arr2.length; i++) {
        	if(arr2[i] == 9) {
        		count = 1;
        	}
        }
        if(count == 1) System.out.println("F");
        else System.out.println("S");
    }
}
