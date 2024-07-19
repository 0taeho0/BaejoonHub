import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String [] arr3 = {"204","207","302","B101","303","501","105"};
    	String [] arr = {"Algorithm", "DataAnalysis", "ArtificialIntelligence"
    			 , "CyberSecurity", "Network", "Startup","TestStrategy"};	
    	String [] arr2 = new String[scan.nextInt()];
    	for(int i=0; i < arr2.length; i++) {
    		arr2[i] = scan.next();
    		for(int j=0; i<arr.length; j++) {
    			if(arr[j].equals(arr2[i])) {
    				System.out.println(arr3[j]);
    				break;
    			}
    		}
    	}
    }
}