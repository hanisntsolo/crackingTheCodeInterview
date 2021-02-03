package dhirendra.february03;
//Standard deviation is Math.sqrt(deviation/length)
//And deviation is sum of all (item-mean) to the power of two.
public class StandardDeviation {
    public static void calculateSD(double[] sequence) {
        double dev = sDeviation(sequence);
        System.out.format("STANDARD DEVIATION CAME OUT TO BE %.6f :",dev);
    }
    private static double sDeviation(double[] arr) {
        int length = arr.length;
        double deviation=0.0;
        double average=0.0;
        for(double num: arr) {
            average+=num;
        }
        double mean = average/length;
        for(double item:arr) {
            deviation+=Math.pow((item-mean),2);
        }
        deviation = Math.sqrt(deviation/length);
        return deviation;
    }

    public static void main(String[] args) {
        calculateSD(new double[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
    }
}
