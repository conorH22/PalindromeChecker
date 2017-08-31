import java.util.Scanner;
//The IsPalindrome method uses a while loop to 
//check whether the first character in the string
// is the same as the last character. If so, it then checks whether the 
//second character is the same as the second last character.
// the process continues until mismatch or until all characters have been checked
// except for a middle character, if the string has odd number of characters.

public class CheckPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter a String?");
		Scanner MyInput = new Scanner(System.in);
		String s = MyInput.next();

		if (IsPalindrome(s)) {
			System.out.println(s + " is a Palindrome");
		} else {
			System.out.println(s + " is not a Palindrome");
		}
	}

	// Check if String is a palindrome
	public static boolean IsPalindrome(String s) {
		// index of first character in string
		int low = 0;
		// int up last character of string
		int up = s.length() - 1;

		while (low < up) {
			if (s.charAt(low) != s.charAt(up))
				return false;
			low++;
			up--;
		}
		return true;// is palindrome

	}

}
