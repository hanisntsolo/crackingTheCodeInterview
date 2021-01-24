package dhirendra.january23;

import java.util.Scanner;
//Awesome question to learn program flow
//PrepInsta question number 01 in tcs previous coding questions
//Problem Statement
//    Our hoary culture had several great persons since time immemorial and king vikramaditya’s nava ratnas (nine gems) belongs to this ilk.
//    They are named in the following shloka:
//    Among these, Varahamihira was an astrologer of eminence and his book Brihat Jataak is recokened as the ultimate authority in astrology.
//
//    He was once talking with Amarasimha,another gem among the nava ratnas and the author of Sanskrit thesaurus, Amarakosha.
//
//    Amarasimha wanted to know the final position of a person, who starts from the origin 0 0 and travels per following scheme.
//
//    TCS NQT Coding
//    Scheme
//    He first turns and travels 10 units of distance
//    His second turn is upward for 20 units
//    Third turn is to the left for 30 units
//    Fourth turn is the downward for 40 units
//    Fifth turn is to the right(again) for 50 units
//    … And thus he travels, every time increasing the travel distance by 10 units.
//
//    Test Cases
//    Case 1
//    Input : 3
//    Expected Output :-20 20
//    Case 2
//    Input: 4
//    Expected Output: -20 -20
//    Case 3
//    Input : 5
//    Expected Output : 30 -20
//    Case 4
//    Input : 7
//    Expected Output : 90 -20
public class PrepInsta01 {
    public void calculateCoordinate(int step) {
        int distance = 10;
        int x = 0;
        int y = 0;
        char ch = 'R';
        while(step>0) {
            switch (ch) {
                case 'R':
                    x+=distance; // x = 10
                    ch = 'U';
                    distance+=10; // d = 20
                    break; // co-(10,0)
                case 'U':
                    y+=distance; //  y = 20
                    ch = 'L';
                    distance+=10; // d = 30
                    break; // co-(10,20)
                case 'L':
                    x-=distance; // x = -20
                    ch = 'D';
                    distance+=10; // d = 40
                    break; // co-(-20, 20)
                case 'D':
                    y-=distance; // y = -20
                    ch = 'A';
                    distance+=10; // d  = 50
                    break; //co-(-20, -20)
                case 'A':
                    x+=distance; // x = 30
                    ch = 'R';
                    distance+=10;
                    break;
            }
            step--;
        }
        System.out.println(x+"  "+y);
    }

    public static void main(String[] args) {
        PrepInsta01 caller = new PrepInsta01();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter total steps\n :");
        int step = scanner.nextInt();
        caller.calculateCoordinate(step);
    }
}
