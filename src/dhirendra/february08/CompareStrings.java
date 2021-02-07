package dhirendra.february08;

public class CompareStrings {
    public static void compareString(String str1, String str2) {
        if(str1.equals(str2)) {
            System.out.println("YES STRINGS ARE EQUAL");
        }    else {
            System.out.println("NO THEY ARE NOT EQUAL");
        }
    }
    public static void compareString1(String str1, String str2) {
        if(str1 == str2){
            System.out.println("YES STRINGS ARE EQUAL");
        } else {
            System.out.println("NO THEY ARE NOT EQUAL");
        }
    }
    public static void compareString2(String str1, String str2) {
        if(str1 == str2){
            System.out.println("YES STRINGS ARE EQUAL");
        } else {
            System.out.println("NO THEY ARE NOT EQUAL");
        }
    }

    public static void main(String[] args) {
        compareString("LOLO", "OLOL");
        compareString("LOLO","LOLO");
        compareString1(new String("DHIRENDRA"),new String("DHIRENDRA"));
        compareString2(("DHIRENDRA"),("DHIRENDRA"));

    }
}
