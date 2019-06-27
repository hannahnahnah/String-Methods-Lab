import java.util.Scanner;

public class stringAndMethodsLab {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a word: ");
		Scanner scnr = new Scanner(System.in);
		String word = scnr.nextLine();
		System.out.println(capitalize(word));
		
		System.out.println("Enter a phrase which includes the word \"Waldo\": ");
		String phrase = scnr.nextLine();
		System.out.println(wheresWaldo(phrase));
		
		System.out.println("Enter a string to alphabetize: ");
		String firstUserString = scnr.nextLine();
		System.out.println("Enter another string to alphabetize: ");
		String secondUserString = scnr.nextLine();
		System.out.println(firstThingsFirst(firstUserString, secondUserString));
		
		System.out.println("Enter a string to reverse: ");
		String s = scnr.nextLine();
		System.out.println(reverse(s));
		
		System.out.println("Enter your first word: ");
		String a = scnr.nextLine();
		System.out.println("Enter your second word: ");
		String b = scnr.nextLine();
		soLong(a, b);
		
		System.out.println("Enter a phrase which may include \"math\": ");
		String mathPhrase = scnr.nextLine();
		afterMath(mathPhrase);
		
		System.out.println("Enter a word to letterize: ");
		String userInput = scnr.nextLine();
		letterize(userInput);
		
	}
	
	public static String capitalize(String word) {
		String first = word.substring(0, 1).toUpperCase();
		String rest = word.substring(1).toLowerCase();
		word = (first + rest);
		return word;
	}
	
	public static int wheresWaldo(String phrase) {
		phrase.toLowerCase();
		int waldoAt = phrase.indexOf("waldo");
		return waldoAt;
	}
	
	public static String firstThingsFirst(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		if ((a.charAt(0)) < (b.charAt(0))) {
			return (a + " " + b);
		} else {
			return (b + " " + a); 
		}
	}
	
	public static String reverse(String s) {
		String reversed = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed = reversed + s.charAt(i);
		}
		return reversed;
	}
	
	public static void soLong(String a, String b) {
		a = a.trim();
		b = b.trim();
		
		if (a.length() == b.length()) {
			System.out.println(a + " " + b);
		} else if (a.length() > b.length()) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
	
	public static void afterMath(String phrase) {
		phrase = phrase.toLowerCase();
		if (phrase.contains("math")) {
			System.out.println(phrase.substring((phrase.indexOf("math"))));
		} else {
			System.out.println("dud");
		}
	}
	
	public static void letterize(String word) {
		for (int i = 0; i < word.length(); ++i) {
			System.out.println(word.charAt(i));
		}
	}
	
}
