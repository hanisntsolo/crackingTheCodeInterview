package dhirendra.february03;

public class AverageArray {
    public static void  average(double[] arr) {
        double sum=0.0;
        for(double num: arr) {
            sum+=num;
        }
        double averageFinal = sum/arr.length;
        System.out.format("Average of the inserted array is %.2f",averageFinal);
        System.out.println("");
    }

    public static void main(String[] args) {
        average(new double[]{23.4,23.56,12.0,1.34});
        average(new double[]{ 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 });
    }
}
