package dhirendra.february04;

public class FloydTriangle {
    public static void main(String[] args) {
        int k=1;
        int number=5;
        for(int i=1;i<=number;i++) {
            for(int j=1;j<i;j++) {
                System.out.print(k+++" ");
            }
            System.out.println("");
        }
    }
}
