/**
 * 
 */
package lizardmanGeneralRegisterOffice;

import java.util.Random;

/**
 * @author Scott Hillier
 *
 */
public class LizardMan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solution to prompt found at
		// https://www.reddit.com/r/NerdyChallenge/comments/3wrqp0/the_lizardmen_general_register_office_easy/

		String[] consonants = {"b","d","f","g","th","l","m","n","p","s","t","v","z","s","t","z"};
		String[] vowels = {"a","e","i","o","u"};
		String syllable = new String();
		Random rand = new Random();
		boolean isDone = false;
		String generatedName ="";
		String[] listOfNames = new String[10];
		int syllableCount = 0;
		
		for(int i = 0; i < listOfNames.length; i++){
			while(!isDone){
				String consonantPart = consonants[rand.nextInt(consonants.length)];
				String vowelPart = vowels[rand.nextInt(vowels.length)];
				syllable = consonantPart + vowelPart;
				generatedName+=syllable;
				listOfNames[i]=generatedName;
				isDone=true;
				syllableCount++;
			}
			syllableCount = 0;
			generatedName = "";
		}
		for(int i = 0; i < listOfNames.length; i++){
			System.out.println(listOfNames[i]);
		}
	}
}
