package JavaPrograms;

import java.util.*;

public class ListJava8 {

    int a=10;

    public static void sortAscendingOrderListNumber(List<Integer> list){
        // Arrays.sort(array, (i1,i2)->i1-i2);
//        list.sort((i1,i2)->i2-i1);
        //list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println("Ascending Order==="+list);
    }

    public static void sortDescendingOrderListNumber(List<Integer> list){
        list.sort(Comparator.nullsFirst(Comparator.reverseOrder()));
        System.out.println("Descending Order==="+list);

    }

    public static void sortAscendingOrderListSting(List<String> list){
        list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println("Ascending Order==="+list);

    }

    public static void sortDescendingOrderListString(List<String> list){
        list.sort(Comparator.nullsFirst(Comparator.reverseOrder()));
        System.out.println("Descending Order==="+list);
    }

    public static void sortEmployeeObjects(){
        Employee emp1 = new Employee("karthik",38,270000d,9894662251L);
        Employee emp2 = new Employee("Harshan",33,8700d,8894662251L);
        Employee emp3 = new Employee("Varshan",22,900000d,8994662251L);
        Employee emp4 = new Employee("Ravi",29,12345678d,1894662251L);
        Employee emp5 = new Employee(null,null,null,null);
        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        System.out.println("Before employee:"+empList);
        empList.sort(Comparator.comparing(Employee::getName,Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER)));
        System.out.println("sorted By Name:Ascending"+empList);
        empList.sort(Comparator.comparing(Employee::getName,Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)).reversed());
        System.out.println("sorted By Name:Descending"+empList);

        empList.sort(Comparator.comparing(Employee::getAge,Comparator.nullsFirst(Integer::compareTo)));
        System.out.println("sorted By Age Ascending:"+empList);
        empList.sort(Comparator.comparing(Employee::getAge,Comparator.nullsLast(Integer::compareTo)).reversed());
        System.out.println("sorted By Age Descending:"+empList);

        empList.sort(Comparator.comparing(Employee::getSalary,Comparator.nullsFirst(Double::compareTo)));
        System.out.println("sorted By Salary Ascending:"+empList);
        empList.sort(Comparator.comparing(Employee::getSalary,Comparator.nullsLast(Double::compareTo)).reversed());
        System.out.println("sorted By Salary Descending:"+empList);

        empList.sort(Comparator.comparing(Employee::getMobile,Comparator.nullsFirst(Long::compareTo)));
        System.out.println("sorted By Mobile Ascending:"+empList);
        empList.sort(Comparator.comparing(Employee::getMobile,Comparator.nullsLast(Long::compareTo)).reversed());
        System.out.println("sorted By Mobile Descending:"+empList);

    }

    public static void main(String[] args) throws ClassNotFoundException {
        List<Integer> listInteger = Arrays.asList(null,77,55,10,100, 88,99);
        List<String> listString = Arrays.asList(null,"Karthik","karthik","apple","Apple");
        ListJava8.sortAscendingOrderListNumber(listInteger);
        listInteger.stream().sorted(Comparator.nullsLast(Comparator.reverseOrder())).forEach(System.out::println);
        listString.stream().sorted(Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER.reversed())).forEach(System.out::println);

    }
}