import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int [] arr2 = {8, 7, 6, 5, 4, 3, 2, 1};
        int [] arr3 = new int[8];
        
        for(int i=0; i<arr3.length; i++) {
        	arr3[i] = scan.nextInt();
        }
        
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<arr3.length; i++) {	
        	if(arr[i] == arr3[i]) {
        		count1++;
        	}
        }
        for(int i=0; i<arr2.length; i++) {	
        	if(arr2[i] == arr3[i]) {
        		count2++;
        	}
        }
        if(count1 == 8) System.out.println("ascending");
        else if(count2 == 8) System.out.println("descending");
        else System.out.println("mixed");
    }
}