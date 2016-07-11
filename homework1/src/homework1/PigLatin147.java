package homework1;

import java.util.Scanner;

//Take an input sentence, then convert it to pig latin
public class PigLatin147 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String phrase = getSentence(reader);
		convertToPigLatin(phrase);
	}
	
	//method getSentence gets input from user
	private static String getSentence(Scanner reader) {
		System.out.println("Enter a sentence to convert: ");
		String phrase = reader.nextLine(); //nextLine() gets the whole input, not just the first word
		return phrase;
	}

	private static void convertToPigLatin(String phrase) {
		String[] words = phrase.split(" "); //takes the input phrase and splits it into individual words
		String pigWords = ""; //empty string to add words back to later
		
		for (String word: words) { 
			StringBuilder letters = new StringBuilder();
			
			//breaks the word into characters, then recreates it, 
			//but adding the first letter and 'ay' to the end
			for (int i = 1; i < word.length(); i++) {
				letters.append(word.charAt(i));
			}
			letters.append(word.charAt(0));
			letters.append('a');
			letters.append('y');
			pigWords += letters.toString() + " "; //adds the words back to the sentence
		}
		System.out.println(pigWords);
	}
}
