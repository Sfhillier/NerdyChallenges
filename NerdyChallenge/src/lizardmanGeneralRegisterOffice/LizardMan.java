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
		Random rand = new Random();
		boolean hasNextSyllable = true;
		String generatedName ="";
		String[] listOfNames = new String[10];
		int syllableCount = 1;
		double probabilityNextSyllable = 0.6;

		for(int i = 0; i < listOfNames.length; i++){
			generatedName = "";
			hasNextSyllable = true;
			syllableCount = 0;
			probabilityNextSyllable = 0.6;
			while(hasNextSyllable){
				String consonantPart = consonants[rand.nextInt(consonants.length)];
				if(consonantPart == "s"){
					double doubleS = rand.nextDouble();
					if (doubleS > 0.5){
						consonantPart = "ss";
					}
				}
				generatedName += consonantPart;
				if(syllableCount == 1){
					generatedName= consonantPart.substring(0, 1).toUpperCase() + consonantPart.substring(1);
				}
				
				String vowelPart = vowels[rand.nextInt(vowels.length)];
				generatedName += vowelPart;
				double randNextSyllable = rand.nextDouble();
				if((syllableCount >= 2) && randNextSyllable < probabilityNextSyllable){
					hasNextSyllable = true;
				}
				else if((syllableCount >=2) &&(randNextSyllable > probabilityNextSyllable)){
					hasNextSyllable=false;
				}
				syllableCount++;
				probabilityNextSyllable-=.1;
			}
			generatedName = generatedName.substring(0, generatedName.length()-1);
			listOfNames[i]=generatedName;
		}
		for(int i = 0; i < listOfNames.length; i++){
			System.out.println(listOfNames[i]);
		}
	}
}
