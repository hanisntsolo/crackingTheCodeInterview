package january21.january21;
//Selection of MPCS exams include a fitness test which is conducted on ground.
//    There will be a batch of 3 trainees, appearing for running test in track for 3 rounds.
//    You need to record their oxygen level after every round.
//    After trainee are finished with all rounds,
//    calculate for each trainee his average oxygen level over the 3 rounds and
//    select one with highest oxygen level as the most fit trainee.
//    If more than one trainee attains the same highest average level, they all need to be selected.
//
//    Display the most fit trainee (or trainees) and the highest average oxygen level.
//
//    Note:
//
//    The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
//    If the calculated maximum average oxygen value of trainees is below 70 then declare the trainees as unfit with meaningful message as “All trainees are unfit.
//    Average Oxygen Values should be rounded.
//    Example 1:
//
//    INPUT VALUES
//    95
//    92
//    95
//    92
//    90
//    92
//    90
//    92
//    90
//    OUTPUT VALUES
//    Trainee Number : 1
//    Trainee Number : 3
//    Note:
//
//    Input should be 9 integer values representing oxygen levels entered in order as
//
//    Round 1
//
//    Oxygen value of trainee 1
//    Oxygen value of trainee 2
//    Oxygen value of trainee 3
//    Round 2
//
//    Oxygen value of trainee 1
//    Oxygen value of trainee 2
//    Oxygen value of trainee 3
//    Round 3
//
//    Oxygen value of trainee 1
//    Oxygen value of trainee 2
//    Oxygen value of trainee 3
//    Output must be in given format as in above example. For any wrong input final output should display “INVALID INPUT”
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        int maximum;
        int[] average = new int[3]; //for average
        int[][] trainee = new int[3][3]; // for record
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<3;i++) {
            System.out.printf("Round:"+(i+1));
            for(int j=0;j<3;j++) {
                System.out.println("\nOxygen value of trainee\t "+(j+1)+" : ");
                int oxLevel  = scan.nextInt();
                if(oxLevel<100 && oxLevel>1) {
                    trainee[i][j] = oxLevel;
                } else {
                    System.out.println("INVALID INPUT");
                    break;
                }
            }
        }
        for(int i=0; i<3 ;i++) { // collecting average values in average array
            int sum = 0;
            for(int j=0; j<3; j++) {
                sum+=trainee[j][i];
            }
            average[i] = sum/3;
        }

//        average[0]>average[1]&& average[0]>average[2]
//            ?
//            maximum = 1:average[1]>average[0]&& average[1]>average[2]
//            ?
//            maximum = 2:average[2]>average[0]&& average[2]>average[1]
//            ?
//            maximum = 3

    }
}
