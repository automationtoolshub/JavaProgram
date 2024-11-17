package JavaPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class SortMap {

    public static void sortPrimitiveMap(){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Karthik");
        map.put(5,"Varshan");
        map.put(3, "Harshan");
        map.put(2,"Kannan");
        map.put(null,"Kannan");
        Iterator<Map.Entry<Integer,String>> ss = map.entrySet().iterator();
        while(ss.hasNext()){
            System.out.println("===="+ss.next());
            ss.hasNext();
        }

        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.nullsFirst(String::compareTo))).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.nullsFirst(String::compareTo))).forEachOrdered(x->new LinkedHashMap<Integer,String>().put(x.getKey(),x.getValue()));
    }

    public static void sortCustomerObjectMap(){
        Employee emp1 = new Employee("karthik",38,270000d,9894662251L);
        Employee emp2 = new Employee("Varshan",33,8700d,8894662251L);
        Employee emp3 = new Employee("Harshan",22,900000d,8994662251L);
        Employee emp4 = new Employee("Ravi",29,12345678d,1894662251L);
        Employee emp5 = new Employee(null,null,null,null);
        Map<Employee,Integer> map = new LinkedHashMap<>();
        map.put(emp1,200);
        map.put(emp2,100);
        map.put(emp3,500);
        map.put(emp4,700);
        map.put(emp5,800);
        // System.out.println(map);
        // map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName,String.CASE_INSENSITIVE_ORDER))).forEach(System.out::println);

        //sort by name
        Map<Employee,Integer> linkedMapName= map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName,Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER))))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldVal,newVal)->newVal, LinkedHashMap::new));
        //sort by Age
        Map<Employee,Integer> linkedMapAge= map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getAge,Comparator.nullsFirst(Integer::compareTo))))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldVal,newVal)->newVal, LinkedHashMap::new));
        //sort by Salary
        Map<Employee,Integer> linkedMapSal= map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary,Comparator.nullsFirst(Double::compareTo))))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldVal,newVal)->newVal, LinkedHashMap::new));

        //sort by mobile
        Map<Employee,Integer> linkedMapMob= map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getMobile,Comparator.nullsFirst(Long::compareTo))))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldVal,newVal)->newVal, LinkedHashMap::new));

        Map<Employee,Integer> linkedMapMobValue= map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldVal,newVal)->newVal, LinkedHashMap::new));

        System.out.println("sortByName=== :"+linkedMapName);
        System.out.println("sortByAge=== :"+linkedMapAge);
        System.out.println("sortBySal=== :"+linkedMapMob);
        System.out.println("sortByMob=== :"+linkedMapSal);
        System.out.println("sortByMobValue=== :"+linkedMapMobValue);



    }

    public static void main(String[] args) {
        //sortCustomerObjectMap();
        sortPrimitiveMap();
    }
}