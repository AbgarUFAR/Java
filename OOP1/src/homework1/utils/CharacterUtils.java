package homework1.utils;

import static java.lang.Character.isLetter;

public class CharacterUtils {
    public static char toUpper(char character) {
        if (character >= 'a' && character <= 'z') {
            character -= 'a' - 'A';
        }
        return character;
    }

    public static char toLower(char character) {
        if (character >= 'A' && character <= 'Z') {
            character += 'a' - 'A';
        }
        return character;
    }

    public static boolean isVowel(char character) {
        character = toUpper(character);
        return character == 'A' || character == 'E' || character == 'I' ||
                character == 'O' || character == 'U';
    }

    public static boolean isConsonant(char character) {
        character = toUpper(character);
        return isLetter(character) && character != 'A' && character != 'E' &&
                character != 'I' && character != 'O' && character != 'U';
    }
}
