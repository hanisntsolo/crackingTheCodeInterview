package dhirendra.february05;

public class CharString {
    public static void main(String[] args) {
        char[] ch = {'a', 'e', 'i', 'o', 'u'};
        //First
        String st = String.valueOf(ch);
        //Second
        String st2 = new String(ch);// passing char array to
                                    //parse as string
        System.out.println(st);
        System.out.println(st2);
    }
}
