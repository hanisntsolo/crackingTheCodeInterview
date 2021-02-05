package dhirendra.february05;
//Very Important Question
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import java.util.ListUtil;
public class JoinLists {
    public static void joinUsingAddAll() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("a");
        list2.add("b");
        List<String> join = new ArrayList<>();
        join.addAll(list1);
        join.addAll(list2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(join);
    }
    public static void joinUsingUnion() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("a");
        list2.add("b");
//        List<String> join = ListUtils.union(list1,list2);
    }
    public static void joinUsingStream() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("a");
        list2.add("b");
        List<String> join = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
        System.out.println(join);
    }

    public static void main(String[] args) {
        joinUsingAddAll();
        joinUsingUnion();
        joinUsingStream();
    }
}
