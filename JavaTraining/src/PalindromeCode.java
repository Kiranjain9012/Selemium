
public class PalindromeCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "ERIC";
		String res = "";
		for(int i=a.length()-1; i>=0; i--) {
			
			res = res + a.charAt(i);
			
		}
		if (res.equals(a)) {
			System.out.println("Palindrome");
		}
		else {
		System.out.println("Not Palindrome");
		}
	}
}
