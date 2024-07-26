import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       while(true) {
    	   String A = scan.nextLine();
    	   int count = 0;
    	   
    	   if(A.equals("#")) break;
    	   A = A.toLowerCase();
    	   for(int i=0; i<A.length(); i++) {
    		   String B = A.substring(i, i+1);
    		   if(B.equals("a")||B.equals("e")||
    				   B.equals("i")||B.equals("o")||
    				   B.equals("u")) count++; 
    	   }
    	   System.out.println(count);
       }
    } 
}
