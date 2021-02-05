package dhirendra.february05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class HashMapToList {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");

        List<Integer> listInteger = new ArrayList(map.keySet());
        List<String> listString = new ArrayList(map.values());
        System.out.println("KEYSET: "+listInteger);
        System.out.println("VALUES: "+listString);

        List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
        List<String> valueList = map.values().stream().collect(Collectors.toList());

        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);
    }
}
