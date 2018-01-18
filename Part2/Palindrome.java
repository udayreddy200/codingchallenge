import java.util.Scanner;

public class Palindrome {
	
	public boolean isPalin(String str){
	    char [] charArray = str.toCharArray();
		int start = 0;
	    int fin = charArray.length - 1;
	    while (fin > start) {
	        if (charArray[start] != charArray[fin]) {
	            return false;
	        }
	        start++;
	        fin--;
	    }
	    return true;
	}
	
public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Palindrome rStr = new Palindrome();
		Boolean res = rStr.isPalin(str);
		if(res==true){
		System.out.println("Input String is Palindrome");
		}
		else{
			System.out.println("Input String is not a Palindrome");
		}
			
		sc.close();
	}
	
	

}
