package dhirendra.february04;
//Watch it once again before going inside
public class FullNumberPyramid {
    private static void numberPyramid(int rows) {
     int count=0,count1=0,k=0;
     for(int i=1;i<=rows;i++) {
         for(int space=1;space<=(rows-i);space++) {
             System.out.print("  ");
             count++;
         }
         while(k != 2*i-1){
             if(count<=rows-1) {
                 System.out.print((i+k)+" ");
                 ++count;
             } else {
                 ++count1;
                 System.out.print(((i+k) -(2 * count1))+ " ");
             }
             k++;
         }
         count=count1=k=0;
         System.out.println();
     }
    }
    public static void main(String[] args) {
        numberPyramid(5);
    }
}
