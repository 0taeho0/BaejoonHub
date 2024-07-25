import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int avg = 0;
       
       for(int i=0; i<5; i++) {
    	   int N = scan.nextInt();
           if(N<40) {
        	   avg+=40;
           }else {
        	   avg+=N;
           }
       }
       System.out.println(avg/5);
    } 
}