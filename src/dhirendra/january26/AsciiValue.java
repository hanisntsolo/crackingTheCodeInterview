package dhirendra.january26;

public class AsciiValue {
    public static void generateAscii(char c) {
        int ch = c;
        int ch1 = (int) c;
        System.out.println("The ASCII value of the entered character is :"+ch1);
        System.out.println("The ASCII value of the entered character is :"+ch);
//        return ch1;
    }

    public static void main(String[] args) {
        generateAscii('d');
        generateAscii('s');
        generateAscii('S');
    }
}
