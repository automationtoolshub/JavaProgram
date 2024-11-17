package JavaPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class MapMiscellaneous {

    static void getMaxMapValue() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(4, 400);
        map.put(11, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder())).forEach(System.out::println);
        Integer max = Collections.max(map.keySet());
        Integer value = Collections.max(map.values());
        // System.out.println(max);
        //System.out.println(value);
        for (Map.Entry<Integer, Integer> entry1 : map.entrySet()) {
            if (entry1.getValue() == value) {
                //System.out.println("Key"+ entry1.getKey() +"Value:"+entry1.getValue());
            }
        }

    }

    static void getMaxMapValue1() {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(11, 1100);
        map.put(4, 400);
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);

        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
                System.out.println(maxEntry);
            }
        }
        System.out.println(maxEntry);

        System.out.println(maxEntry.getKey());
        System.out.println(maxEntry.getValue()
        );
    }

    public static void getDuplicateFromList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 8));
        Integer sum = 0;
        for (Integer a : list) {
            sum = sum + a;
        }
        System.out.println("sum====" + sum);
        List<Integer> ll1 = list.stream().sorted(Comparator.nullsLast(Comparator.reverseOrder())).collect(Collectors.toList());
        System.out.println(ll1);
        System.out.println(ll1.get(0));
        Set<Integer> s = new HashSet<>();
        list.stream().filter(e -> !s.add(e)).forEach(System.out::println);
        // System.out.println(duplicateValuelist);
    }

    public static void getDuplicateFromList1() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 5));
        Set<Integer> s = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (Integer duplicate : list) {
            if (!s.add(duplicate)) {
                s2.add(duplicate);
            }
        }
        System.out.println(s2);
    }

    public static void main(String[] args) {
        //getMaxMapValue();
        getDuplicateFromList();
    }
}