package dhirendra.january27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReverse {
    //using byte array
    public static String reverseStringUsingByte(String str) {
            String newStr = str;
//            get bytes method to convert string into bytes.
        byte[] strAsByteArray = newStr.getBytes();
        byte[] result = new byte[strAsByteArray.length];// Initialising the result with the length as same as this one
        for(int i=0;i<strAsByteArray.length;i++) {
            result[i]=strAsByteArray[strAsByteArray.length-i-1]; //Nice reversal make sure to revise this reversal
            System.out.println(result[i]);
        }
        return new String(result); //Converting back to appropriate return type

    }
    public static String reverseStringUsingStringBuilder(String str) {
        //Shorter than byte array uses StringBuilder from java.lang
        String input = str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        stringBuilder.reverse();
        return new String(stringBuilder);
    }
    public static char[] reverseStringUsingCharacterArray(String str) {
        char[] chars = str.toCharArray();
        char[] newChars = new char[str.length()];
        for(int i=chars.length-1,j=0 ;i>=0;i--,j++) {
//            System.out.print(chars[i]);
            newChars[j] = chars[i];
        }

        return newChars;
    }
    public static char[] reverseStringUsingSwappingElements(String str) {
        char[] tempString = str.toCharArray();
        int left, right = 0;
        right = tempString.length -1;
        for(left = 0;left<right;left++,right--) {
            char temp = tempString[left];
            tempString[left] = tempString[right];
            tempString[right] = temp;
        }
        for(char c: tempString) {
//            System.out.print(c);
        }
        return tempString;
    }
    public static String reverseStringUsingArrayList(String str) {
        char[] toReverse = str.toCharArray();
//        char[] reversedString = new char[str.length()];
        List<Character> characterList = new ArrayList<>();
        for(char c: toReverse) {
            characterList.add(c);
        }
        Collections.reverse(characterList);
        ListIterator iterator = characterList.listIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }
        return String.valueOf(characterList);
    }
    //Smallest method to reverse String
    public static boolean reverseStringUsingStringBuffer(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        return false;
    }
}
class Main {
    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();
        String str ;
        str = "Dhirendra";
        System.out.println(stringReverse.reverseStringUsingByte(str));
        System.out.println(stringReverse.reverseStringUsingStringBuilder(str));
        System.out.println(stringReverse.reverseStringUsingCharacterArray(str));
        System.out.println(stringReverse.reverseStringUsingSwappingElements(str));
        System.out.println(stringReverse.reverseStringUsingArrayList(str));
        System.out.println(stringReverse.reverseStringUsingStringBuffer(str));

    }
}
