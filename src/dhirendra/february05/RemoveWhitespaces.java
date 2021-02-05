package dhirendra.february05;

public class RemoveWhitespaces {
    public static void main(String[] args) {
        String str = "Dhirendra Pratap Singh";
        StringBuilder str1 = new StringBuilder();
        int i=0;
        int length = str.length();
        while(length>0) { // via logic
            if(str.charAt(i)!=' ') {
                str1.append(str.charAt(i));
            }
            i++;
            length--;
        }
        System.out.println(str1);
        str = str.replaceAll("\\s",""); //Oneliner
        System.out.println(str);
    }
}
