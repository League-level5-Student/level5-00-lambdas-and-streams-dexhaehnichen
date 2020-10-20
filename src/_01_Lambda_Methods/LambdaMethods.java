package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.

		printCustomMessage((s) -> {
			StringBuilder sb = new StringBuilder(s);
			System.out.println(sb.reverse().toString());
		}, "test");

		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an[d] lower case characters.

		printCustomMessage((s) -> {
			String end = "";
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 0) {
					end += s.toLowerCase().charAt(i);
				} else {
					end += s.toUpperCase().charAt(i);
				}
			}
			System.out.println(end);
		}, "test");

		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.

		printCustomMessage((s) -> {
			String end = "";
			for (int i = 0; i < s.length(); i++) {
				end += s.charAt(i);
				end += '.';
			}
			System.out.println(end);
		}, "test");

		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.

		printCustomMessage((s) -> {
			String end = "";
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) !=  'o' && s.charAt(i) != 'u') {
					end += s.charAt(i);
				}
			}
			
			System.out.println(end);
		}, "test");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
