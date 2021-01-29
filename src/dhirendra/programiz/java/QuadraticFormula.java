package dhirendra.programiz.java;

public class QuadraticFormula {
    public static void quadCalculator(double a, double b, double c) {
        //find the determinant first
        double real,imaginary,d = b*b - 4*(a*c);
        //checking determinant and finding roots
        real = -b/(2*a);
        imaginary = Math.sqrt(d)/(2*a);
        if(d>0) {
            //real and distinct roots
            System.out.println("The roots of the equation is : " + (real + imaginary)+ ", "+(real-imaginary));
        } else if(d == 0) {
            // real and repeated roots
            System.out.println("The roots of the equation are real and repeated : " + real +", " + real);
        } else if(d < 0) {
            System.out.printf("Root 1 is %.2f + %.2f",real,imaginary);
            System.out.printf("Root 1 is %.2f - %.2f",real,imaginary);
        }
    }

    public static void main(String[] args) {
        quadCalculator(2.3,4,5.6);
    }
}
