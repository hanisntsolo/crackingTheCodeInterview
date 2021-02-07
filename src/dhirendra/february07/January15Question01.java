package dhirendra.february07;
//To print characters at odd position of a string
//
//
//    input: Matrix
//    output : Mti
import java.util.Scanner;
public class January15Question01 {
    public static void printOddCharacters(String string){
        char[] stringArray = string.toCharArray();
        for(int i = 0; i<stringArray.length/2+1 ;i++){
            System.out.print(stringArray[2*i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("PLEASE ENTER A STRING: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        printOddCharacters(str);
    }
}
