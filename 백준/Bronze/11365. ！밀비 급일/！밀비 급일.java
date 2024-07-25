import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String r = "";
       
       while(true) {
    	   String A = scan.nextLine();
    	   
    	   if(A.equals("END")) break;
    	   
    	   for(int i=A.length()-1; i>=0; i--) {
    		   r = r + A.charAt(i);
    	   }
    	   System.out.println(r);
    	   r="";
       }
    } 
}