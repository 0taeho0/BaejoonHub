import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int [] arr = new int[26];
       String [] strarr = {"a","b","c","d","e","f","g","h",
		    		   "i","j","k","l","m","n","o","p",
		    		   "q","r","s","t","u","v","w",
		    		   "x","y","z",};
       String A = scan.next();
       String [] arr2 = new String[A.length()];
       
       for(int i=0; i<A.length(); i++) {
    	   arr2[i] = A.substring(i, i+1);
    	   for(int j=0; j<arr.length; j++) {
    		   if(arr2[i].equals(strarr[j])) {
    			   arr[j] +=1;
    		   }
    	   }
       }
       for(int i=0; i<arr.length; i++) {
    	   System.out.print(arr[i]+" ");
       }
    } 
}