package homework1.bookloops;

import utils.CharacterUtils;

import static utils.Input.scan;

public class Exercise49 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        int numOfVowels = 0;
        int numOfConsonants = 0;
        for (int i = 0; i < str.length(); i++) {
            if (CharacterUtils.isVowel(str.charAt(i))) {
                numOfVowels++;
            } else if (CharacterUtils.isConsonant(str.charAt(i))) {
                numOfConsonants++;
            }
        }
        System.out.println("The number of vowels is " + numOfVowels);
        System.out.println("The number of consonants is " + (numOfConsonants));
    }
}
