package org.school;

public class Vowels {
	public static void main(String[] args) {
		String s = "Welcome to Java";
		int vowel = 0;
		int nonVowel = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				System.out.println("Vowels" + " " + ch);
				vowel++;
			} else {
				System.out.println("Non vowels" + " " + ch);
				nonVowel++;
			}
		}
		System.out.println("Total vowels" + " " + vowel);
		System.out.println("Total nonVowels" + " " + nonVowel);
	}
}
