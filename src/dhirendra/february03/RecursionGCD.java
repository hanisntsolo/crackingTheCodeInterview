package dhirendra.february03;

public class RecursionGCD {
    private static int gcd(int n1, int n2) {
        if(n2!=0)
            return gcd(n2,n1%n2);
        else
            return n1;
    }
    public static void executer(int a1, int a2) {
        int hcf = gcd(a1,a2);
        System.out.println("The hcf of the numbers is "+hcf);
    }

    public static void main(String[] args) {
        executer(45,90);
        executer(366,60);
    }
}
