package dhirendra.programiz.java;

public class AlphabetOrNot {
    public static void isAlphabet(char c) {
        if((c>='a'&& c<='z')|| (c>='A'&& c<='Z')) {
            System.out.println(c+ " IS ALPHABET");
        } else {
            System.out.println(c+ "IS NOT ALPHABET");
        }
    }

    public static void main(String[] args) {
        isAlphabet('a');
        isAlphabet('&');
        isAlphabet('*');
        System.out.println(Character.isAlphabetic('a'));;
        System.out.println(Character.isAlphabetic('$'));;
    }
}
