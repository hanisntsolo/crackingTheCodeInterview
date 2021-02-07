package dhirendra.february07;

public class February10Question01 {

    public static void countVowelConsonants(String str){
        int vowel=0;
        int consonant=0;
        char[] stringArray = str.toCharArray();
        for(char ch:stringArray) {
            if(
                ch == 'a'
                    || ch == 'e'
                    || ch == 'i'
                    || ch == 'o'
                    || ch == 'u'
                    || ch == 'A'
                    || ch == 'E'
                    || ch == 'I'
                    || ch == 'O'
                    || ch == 'U'
            ) {
                vowel++;
            } else {
                consonant++;
            }

        }
        System.out.println("CONSONANTS: "+consonant);
        System.out.println("VOWELS: "+vowel);
    }

    public static void main(String[] args) {
        countVowelConsonants("DHIRENDRA");
    }
}
