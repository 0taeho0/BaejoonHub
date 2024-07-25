import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       String A = scan.next();
       int count = 0;
       for(int i=0; i<A.length(); i++) {
    	   String B = A.substring(i, i+1);
    	   if(B.equals("a")||B.equals("e")||
    			   B.equals("i")||B.equals("o")||
    			   B.equals("u")) {
    		   count++;
    	   }
       }
       System.out.println(count);
    } 
}