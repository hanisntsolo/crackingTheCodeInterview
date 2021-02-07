package dhirendra.february07;

import java.util.Arrays;

//Print smallest vowel in a given string
public class February13Question01 {
    public static void smallestVowel(String str){
        int totalVowels = countVowelConsonants(str);
        char[] vowelArray = new char[totalVowels];
        char[] stringArray = str.toCharArray();
        int index=0;
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
                vowelArray[index++] = ch;
            } else {
                continue;
            }
        }
        Arrays.sort(vowelArray);
        System.out.println(vowelArray[0]);
    }
    public static int countVowelConsonants(String str){
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
        return vowel;
//        System.out.println("CONSONANTS: "+consonant);
//        System.out.println("VOWELS: "+vowel);
    }

    public static void main(String[] args) {
        smallestVowel("DHIRENDRA");
        smallestVowel("PRATAP");
        smallestVowel("SHIVNGEE");
    }
}
