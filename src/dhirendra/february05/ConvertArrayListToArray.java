package dhirendra.february05;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray {
    public static void arrayListToArray(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Dhirendra");
        list.add("Pratap");
        list.add("Singh");
        System.out.println("ArrayList : "+list);
        String[] arr = new String[list.size()];
        list.toArray(arr);//Here, the toArray() method converts the arraylist
        // languages into an array. And stores it in the string array arr.
        System.out.println("Array : ");
        for(String item:arr) {
            System.out.println(item);
        }
    }
    public static void arrayToArrayList(){
        String[] str = {"Dhriendra", "Pratap", "Singh"};
        System.out.println("Array: "+ Arrays.toString(str));
        //convertArrrayToArrayList
        ArrayList<String> name = new ArrayList<>(Arrays.asList(str));
        System.out.println("NAME: "+name);
    }

    public static void main(String[] args) {
        arrayListToArray();
        arrayToArrayList();
    }
}
