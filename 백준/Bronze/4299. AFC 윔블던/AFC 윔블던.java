import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if(a < b) {
            System.out.println("-1");
    	}else {
            int x = (a+b)/2, y = (a-b)/2;
            if(x+y==a && x-y==b) {
            	System.out.println(x+" "+y);
                
            }else {
            	System.out.println("-1");
            }
        }
    }
}