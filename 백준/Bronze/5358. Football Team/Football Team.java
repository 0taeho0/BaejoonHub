import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	while(scan.hasNext()) {
    		String N = scan.nextLine();
        	String name = "";
    		for(int j=0; j<N.length(); j++) {
    			if(N.substring(j, j+1).equals("I"))
    				name += "E";
    			else if(N.substring(j, j+1).equals("E"))
    				name += "I";
    			else if(N.substring(j, j+1).equals("i"))
    				name += "e";
    			else if(N.substring(j, j+1).equals("e"))
    				name += "i";
    			else name += N.charAt(j);
    		}
    		System.out.println(name);
    		name = "";
    	}
    }
}