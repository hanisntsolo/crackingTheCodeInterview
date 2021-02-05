package dhirendra.february05;

import java.util.Arrays;

public class StringChar {

    public static void main(String[] args) {
        String st = "This is great";
        //very important line to remember
        //again very very important
        st = st.replaceAll("\\s","");
        char[] chars = st.toCharArray();
        System.out.println(Arrays.toString(chars));
    }
}
