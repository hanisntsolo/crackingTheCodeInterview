package dhirendra.programiz.java;

public class Vowel {
    public static void vowelChecker(char ch) {
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
            System.out.println("ENTERED CHARACTER IS VOWEL");
        } else {
            System.out.println("ENTERED CHARACTER IS CONSONANT");
        }
    }

    public static void main(String[] args) {
        vowelChecker('A');
        vowelChecker('b');
        vowelChecker('i');
        vowelChecker('m');
        vowelChecker('u');
        vowelChecker('a');
    }
}
