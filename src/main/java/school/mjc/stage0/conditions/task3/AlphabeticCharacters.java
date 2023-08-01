package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if(character == 65 || character == 69 || character == 73 || character == 79 || character == 85 || character == 97 || character == 101 ||
                character == 105 || character == 111 || character == 117){
            System.out.println("Vowel");
        }
        else if (character >= 65 && character <= 122) {
            System.out.println("Consonant");
        }
        else{
            System.out.println("wrong alphabet!");
        }
    }

    public static void main(String[] args) {
        AlphabeticCharacters alphabeticCharacters = new AlphabeticCharacters();
        char character = 'კ';
        alphabeticCharacters.vowelDeterminer(character);
    }

}