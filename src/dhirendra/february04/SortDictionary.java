package dhirendra.february04;

public class SortDictionary {
    public static void sortAlphabetically(String[] words) {
        int length = words.length;
        for(int i = 0; i < 3; ++i) {
            for (int j = i + 1; j < 4; ++j) {
                if (words[i].compareTo(words[j]) > 0) {

                    // swap words[i] with words[j[
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
//        while(i<length) {
//            int j=i+1;
//            while(j<length) {
//                if(words[i].compareTo(words[j])>0) {
//                    swap(words[i],words[j]);
//                }
//                j++;
//            }
//            i++;
////            j++;
//        }
        for(String item: words) {
            System.out.println(item);
        }
    }
//    private static void swap(String str1, String str2) {
//        String tempString = str1;
//        str1 = str2;
//        str2 = tempString;
//    }

    public static void main(String[] args) {
        sortAlphabetically(new String[]{ "Ruby", "C", "Python", "Java" });
    }
}
