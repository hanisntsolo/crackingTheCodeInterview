package dhirendra.programiz.java;

public class FibonacciSeries {
    public static void fibonacci(int n) {
        int start = 0;
        int counter,stepper,incrementer = 1;
        stepper = start+incrementer;
        System.out.print(start+" "+incrementer+" ");
        for(counter = 2;counter<n;counter++) {
            System.out.print(stepper + " ");
            stepper = stepper+incrementer;
            incrementer = stepper-incrementer;
        }
    }

    public static void main(String[] args) {
        fibonacci(45);
    }
}
