import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int L = scan.nextInt();
       int A = scan.nextInt();
       int B = scan.nextInt();
       int C = scan.nextInt();
       int D = scan.nextInt();
       
       if((A%C) != 0) A=(A/C)+1;
       else A/=C;
       if((B%D) != 0) B=(B/D)+1;
       else B/=D;
       if(A >= B) {
    	   L -= A;
       }else {
    	   L-=B;
       }
       System.out.println(L);
    } 
}