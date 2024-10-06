import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int N = scan.nextInt();
			int arr[] = new int[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = scan.nextInt();
			} 
			
			Stack<Integer> stack = new Stack<>();
			StringBuffer bf = new StringBuffer(); 
			
            int num  = 1;
			boolean result = true;
			
			for (int i = 0; i < arr.length; i++) {
				int su = arr[i];
				
				if (su >= num) {
					while (su >= num) {						
						stack.push(num++);
						bf.append("+\n");
					}
					stack.pop();
					bf.append("-\n");
				}
				else {
					int p = stack.pop(); 
					
					if(p != su) {
						System.out.print("NO");
						result = false;
						break;
					}
					else {
						bf.append("-\n");
					}
				} 
				
			}
			if (result) {
				System.out.println(bf.toString());
			}
	}

}