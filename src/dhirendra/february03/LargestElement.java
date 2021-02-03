package dhirendra.february03;

public class LargestElement {
    public static void  largest(double[] arr) {
        double largest = arr[0];
        for(double num: arr) {
            if(largest<num)
                largest = num;
        }
        System.out.println("Largest in the array is :"+largest);
    }

    public static void main(String[] args) {
        largest(new double[]{23.4,23.56,12.0,1.34});
        largest(new double[]{ 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 });
    }
}
