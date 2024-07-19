import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		
    		int [] arr1 = {12, 11, 11, 10, 9, 9, 9, 8, 7, 6, 6};
    		int [] arr2 = {1600, 894, 1327, 1311, 1004, 1178, 1357, 837, 1055, 556, 773};
     		
    		int N = scan.nextInt();
    		
    		System.out.println(arr1[N-1]+ " " + arr2[N-1]);
    }
}