package dhirendra.january29;
//Pending to be completed
public class LongestPalindromicSubstring {
    public static String palindromicSubstring(String s) {
        StringBuilder stringBuffer = new StringBuilder(s);
        for(int right = s.length()-1;right>0;right--) {
            stringBuffer.reverse();
            if(stringBuffer.toString().equals(s)) {
                return s;
//                System.out.println("INSIDE FINAL CALL");
//                System.out.println(stringBuffer);
//                break;
            } else {
//                System.out.println("Value of right index"+right);
//                System.out.println("INSIDE SUBSIDIARY CALL");
                stringBuffer.reverse();
                stringBuffer.deleteCharAt(right);
//                System.out.println(stringBuffer);
                s = s.substring(0,right);
//                System.out.println(s);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(palindromicSubstring("babad"));;
    }
}
