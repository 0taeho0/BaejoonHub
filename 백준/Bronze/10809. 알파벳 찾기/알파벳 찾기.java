import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r",
        		"s","t","u","v","w","x","y","z"};
        int[] arr2 = new int[26];
        for (int i = 0; i < 26; i++) {
            arr2[i] = -1;
        }
        
        String name = scan.next();
        
        for (int i = 0; i < name.length(); i++) {
            String n = name.substring(i, i + 1);
            for (int j = 0; j < arr.length; j++) {
                if (n.equals(arr[j]) && arr2[j] == -1) {
                    arr2[j] = i;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
