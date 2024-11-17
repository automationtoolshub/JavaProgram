package JavaPrograms;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public class SortArrayJava8 {

    public static void sortAscendingOrderArraysNumber(Integer[] array){
        // Arrays.sort(array, (i1,i2)->i1-i2);
        Arrays.sort(array, Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println("Ascending Order==="+Arrays.toString(array));
    }

    public static void sortDescendingOrderArraysNumber(Integer[] array){
        Arrays.sort(array, Comparator.nullsFirst(Comparator.reverseOrder()));
        System.out.println("Descending Order==="+Arrays.toString(array));

    }

    public static void sortAscendingOrderArraysSting(String[] array){
        Arrays.sort(array, Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println("Ascending Order==="+Arrays.toString(array));

    }

    public static void sortDescendingOrderArraysString(String[] array){
        Arrays.sort(array, Comparator.nullsFirst(Comparator.reverseOrder()));
        System.out.println("Descending Order==="+Arrays.toString(array));
    }

    public static void sortEmployeeObjects(){
        Employee emp1 = new Employee("karthik",38,270000d,9894662251L);
        Employee emp2 = new Employee("Harshan",33,8700d,8894662251L);
        Employee emp3 = new Employee("Varshan",22,900000d,8994662251L);
        Employee emp4 = new Employee("Ravi",29,12345678d,1894662251L);
        Employee emp5 = new Employee(null,null,null,null);
        Employee[] empArray = new Employee[]{emp1,emp2,emp3,emp4,emp5};
        System.out.println("Before employee:"+Arrays.toString(empArray));
        Arrays.sort(empArray,Comparator.comparing(Employee::getName,Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER)));
        Arrays.sort(empArray,Comparator.comparing(Employee::getName,Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER)));
        System.out.println("sorted By Name:Ascending"+Arrays.toString(empArray));
        Arrays.sort(empArray,Comparator.comparing(Employee::getName,Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)).reversed());
        System.out.println("sorted By Name:Descending"+Arrays.toString(empArray));

        Arrays.sort(empArray,Comparator.comparing(Employee::getAge,Comparator.nullsFirst(Integer::compareTo)));
        System.out.println("sorted By Age Ascending:"+Arrays.toString(empArray));
        Arrays.sort(empArray,Comparator.comparing(Employee::getAge,Comparator.nullsLast(Integer::compareTo)).reversed());
        System.out.println("sorted By Age Descending:"+Arrays.toString(empArray));

        Arrays.sort(empArray,Comparator.comparing(Employee::getSalary,Comparator.nullsFirst(Double::compareTo)));
        System.out.println("sorted By Salary Ascending:"+Arrays.toString(empArray));
        Arrays.sort(empArray,Comparator.comparing(Employee::getSalary,Comparator.nullsLast(Double::compareTo)).reversed());
        System.out.println("sorted By Salary Descending:"+Arrays.toString(empArray));

        Arrays.sort(empArray,Comparator.comparing(Employee::getMobile,Comparator.nullsFirst(Long::compareTo)));
        System.out.println("sorted By Mobile Ascending:"+Arrays.toString(empArray));
        Arrays.sort(empArray,Comparator.comparing(Employee::getMobile,Comparator.nullsLast(Long::compareTo)).reversed());
        System.out.println("sorted By Mobile Descending:"+Arrays.toString(empArray));
    }

    public static void main(String[] args) {
        Integer[] iArray = new Integer[]{77,55,10,100, 88,99,null};
        // String[] sArray = new String[]{"#alexa","!ball","_cdd","KAannan","  karthik"," karthik","anand","raja","ravi","ztt","zee","zab", "toy",null};
        String[] sArray = new String[]{"@MONEY MARKET","mike MONEY MARKET","MONEY MARKET","mONEY MARKET","nick_MONEY MARKET"};
        SortArrayJava8.sortAscendingOrderArraysNumber(iArray);
        SortArrayJava8.sortDescendingOrderArraysNumber(iArray);
        SortArrayJava8.sortAscendingOrderArraysSting(sArray);
        SortArrayJava8.sortDescendingOrderArraysString(sArray);
        Arrays.sort(sArray,Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER));
        System.out.println("===llll===="+Arrays.toString(sArray));
        sortEmployeeObjects();
    }
}