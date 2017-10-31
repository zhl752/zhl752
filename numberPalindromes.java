/*
 * Name:zhiwei lin
 * 
 * 
 */
public class numberPalindromes {

	// Creates numbers between 1000 and 9999
	public static boolean numbers() {
		int num1 = 0;
		int num2 = 0;
		for (int i = 1000; i < 10000; i++) {
			for (int j = 1000; j < 10000; j++) {
				String value = String.valueOf(i * j);
				// Runs through the palindrome check, if true store value in num1 or num2
				if (isaPalindrome(value)) {
					num1 = j;
					num2 = i;
				}
			}

		}

		// Prints the palindromic product of num1 and num2
		System.out.println(num1 + " * " + num2);
		System.out.print(num1 * num2);

		return true;
	}

	public static boolean isaPalindrome(String value) {
		// This is a an empty input or of 0 length
		if (value.length() == 0 || value.equals(" ")) {
			return true;
		}

		// This compares the first and last character of the string.
		if (value.charAt(0) == value.charAt(value.length() - 1)) {
			if (value.length() == 3) {
				if (value.charAt(0) == value.charAt(value.length() - 1)) {
					return true;
				}
			}

			// This calls isaPalindrome again and compares substring at location substring 1
			// and the end of the string -1
			return isaPalindrome(value.substring(1, value.length() - 1));
		}

		return false;
	}

	public static void main(String[] args) {

		if (numbers()) {
			System.out.println(" is the largest palindrome");

		} else
			System.out.println("No possible palindromes");

	}
}