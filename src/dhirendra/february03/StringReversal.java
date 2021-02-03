package dhirendra.february03;

public class StringReversal {
    public static void stringReversal(String str) {
        String newString = reverse(str);
        System.out.println("The reversal of"+str+" is "+ newString);
    }
    private static String reverse(String str) {
        if(str.isEmpty())
            return str;
        else
            return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        stringReversal("Dhirendra");
        stringReversal("Madam");
        stringReversal("malayalam");
    }
}
