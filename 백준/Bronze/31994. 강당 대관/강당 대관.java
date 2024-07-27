import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        String [][] arr = new String[7][2];
        String name = "";
        
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<2; j++) {
        		arr[i][j] = scan.next();
        	}
        }
        int max = 0;
        for(int i=0; i<arr.length; i++) {
        	if(max < Integer.parseInt(arr[i][1])) {
        		max = Integer.parseInt(arr[i][1]);
        		name = arr[i][0];
        	}
        }
        System.out.println(name);
    }
}
