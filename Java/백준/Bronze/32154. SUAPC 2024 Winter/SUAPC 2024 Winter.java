import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(bf.readLine());
		String [][] arr = {
				{"11", "A B C D E F G H J L M"},
                {"9", "A C E F G H I L M"},
                {"9", "A C E F G H I L M"},
                {"9", "A B C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A B C F G H L M"}
		};
		System.out.println(arr[A-1][0]);
		System.out.println(arr[A-1][1]);
	}
}