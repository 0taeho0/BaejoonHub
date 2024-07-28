import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 0;
        
        for(int i=1; i<a; i++) {
        	if(i==1||i==3||i==5||
        			i==7||i==8||i==10||
        			i==12) sum+=31;
        	else if(i==2) sum+=28;
        	else sum+=30;
        }
        sum+=b;
        
        int A = sum % 7;
        if(A==0) System.out.println("SUN");
        else if(A==1) System.out.println("MON");
        else if(A==2) System.out.println("TUE");
        else if(A==3) System.out.println("WED");
        else if(A==4) System.out.println("THU");
        else if(A==5) System.out.println("FRI");
        else if(A==6) System.out.println("SAT");
        
        
	}
}
