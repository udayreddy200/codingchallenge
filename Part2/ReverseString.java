import java.util.Scanner;

public class ReverseString {
	
	public String reverse(String str) {
		   StringBuilder sbuilder = new StringBuilder();
		   for(int i = str.length() - 1; i >= 0; i--)
		     sbuilder.append(str.charAt(i));
		   return sbuilder.toString();
		 }
	
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ReverseString rStr = new ReverseString();
		String res = rStr.reverse(str);
		System.out.println("This is reverse of String:"+res);
		sc.close();
		
	}
	
	

}
