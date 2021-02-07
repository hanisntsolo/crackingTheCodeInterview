package dhirendra.february08;

import java.util.Arrays;

public class LookupEnumByStringValue {
    public enum  TextStyle{
        BOLD, ITALIC, CURSIVE, GENERICS
    }

    public static void main(String[] args) {
        String style = "bold";
        System.out.println(Arrays.deepToString(TextStyle.values()));
        TextStyle textStyle = TextStyle.valueOf(style.toUpperCase());
        System.out.println(textStyle);
    }
}
