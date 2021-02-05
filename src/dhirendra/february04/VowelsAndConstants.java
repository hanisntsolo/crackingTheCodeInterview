package dhirendra.february04;
//good
public class VowelsAndConstants {
    public static void countVowelsAndConsonant(String str) {
        int i=0;
        int vowel=0;
        int consonant=0;
        while(i<str.length()) {
            switch (str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowel++;
                    break;
                case ' ':
                    i++;
                    continue;
                default:
                    consonant++;
            }
            i++;
        }
        System.out.println("VOWELS "+vowel);
        System.out.println("CONSONANTS "+consonant);
    }

    public static void main(String[] args) {
        countVowelsAndConsonant("Shivangee");
        countVowelsAndConsonant("Dhirendra Pratap Singh");
    }
}
