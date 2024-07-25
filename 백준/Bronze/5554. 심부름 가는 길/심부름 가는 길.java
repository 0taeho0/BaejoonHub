import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int sum = 0;
       
       int [] arr = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};       
    
       for(int i=0; i<arr.length; i++) {
    	   sum += arr[i];
       }
       System.out.println(sum/60);
       System.out.println(sum%60);
    } 
}