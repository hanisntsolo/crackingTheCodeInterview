package dhirendra.january28;

public class Palindrome {
    public static boolean palindromeOrNot(String str) {
        //this method wasn't successful in returning the final answer.
       char[] chars = str.toCharArray();
       char[] newChars = new char[str.length()];
       int left,right=str.length()-1;
       for(left=0;left<str.length()-1;left++,right--) {
           newChars[left] = chars[right];
       }
       String palindrome = newChars.toString();
        System.out.println("The reversed string is equal to "+palindrome.toString());
       if(palindrome.equals(str)) {
           return true;
       }
       return false;
    }
    public static boolean palindromeOrNotUsingStringBuffer(String str) {
        //String reversal is taking place but
        // unable to compare them because the two are two different instances in java
        // Lets see if a round about is available
        //Breakthrough if we use .equals then the values get compared and i get the correct output
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer stringBuffer1 = new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);
        if(stringBuffer.toString().equals(stringBuffer1.toString()))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(palindromeOrNotUsingStringBuffer("Dhirendra"));
        System.out.println(palindromeOrNotUsingStringBuffer("madam"));
        System.out.println(palindromeOrNot("Dhirendra"));
        System.out.println(palindromeOrNot("madam"));

    }
}
