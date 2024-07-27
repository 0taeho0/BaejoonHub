import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String [] arr = {"a","b","c","d","e","f",
        		"g","h","i","j","k","l",
        		"m","n","o","p","q","r",
        		"s","t","u","v","w","x","y","z"};
        int [] arr2 = new int[arr.length];
        String [] arr3 = new String[scan.nextInt()];
        String N = "";
        for(int i=0; i<arr3.length; i++) {
        	arr3[i] = scan.next();
        }
        for(int i=0; i<arr3.length; i++) {
        	String name = arr3[i].substring(0,1);
        	for(int j=0; j<arr.length; j++) {
        		if(name.equals(arr[j])) {
        			arr2[j] +=1;
        		}
        	}
        }
        for(int i=0; i<arr2.length; i++) {
        	if(arr2[i] >= 5) {
        		N+=arr[i];
        	}
        }
        if(N.equals("")) {
        	System.out.println("PREDAJA");
        }else {
        	System.out.println(N);
        }
    }
}