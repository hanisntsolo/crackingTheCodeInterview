package dhirendra.february04;

public class FullPyramid {
    private static void fullPyramid(int height) {
        int k=0;
        for(int i=1;i<=height;i++,k=0) {
            for(int space=0;space<=(height-i);space++) {
                System.out.print(" ");
            }
            while(k!=(2*i-1)) {
                System.out.print("*");
                k++;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        fullPyramid(5);
    }
}
