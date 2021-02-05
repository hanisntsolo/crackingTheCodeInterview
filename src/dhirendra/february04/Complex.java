package dhirendra.february04;

public class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return "Complex{" +
            "real=" + real +
            ", imaginary=" + imaginary +
            '}';
    }

    public static Complex complexAdder(Complex n1, Complex n2) {
        Complex temp = new Complex(0.0,0.0);
        temp.real = n1.real+n2.real;
        temp.imaginary = n1.imaginary+n2.imaginary;
        return temp;
    }

    public static void main(String[] args) {
        Complex number1 = new Complex(2.3, 4.6);
        Complex number2 = new Complex(3.2,1.6);
        Complex number3 = complexAdder(number1,number2);
        System.out.println(number1.toString());
        System.out.println(number2.toString());
        System.out.println(number3.toString());
    }
}
