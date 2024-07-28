import java.util.Scanner;

public class Main {
    @SuppressWarnings("null")
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        String S = scan.next();
        int count = 0;
        
        for(int i=0; i<N; i++) {
        	String S1 = S.substring(i, i+1);
        	if(S1.equals("a")||S1.equals("u")||
        			S1.equals("e")||S1.equals("i")||
        			S1.equals("o")) count++;
        }
        System.out.println(count);
    }
}
