import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int C = 0;
       int N = scan.nextInt();
       int []arr = {scan.nextInt(),scan.nextInt(),
    		   scan.nextInt(),scan.nextInt(),
    		   scan.nextInt()};
       
       for(int i=0; i<arr.length; i++) {
    	   if(arr[i] == N) C+=1;
       }
       System.out.println(C);
    } 
}