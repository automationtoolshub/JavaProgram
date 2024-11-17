package JavaPrograms;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class SortListInJava8 {

    public static void sumOfList(List<Integer> listInteger){

        int totalSum=listInteger.stream().filter(x->x!=null).mapToInt(x->x).sum();
        System.out.println("TotalSum==="+totalSum);

    }

    public static void minNumberInList(List<Integer> listInteger){

        int min=listInteger.stream().filter(x->x!=null).mapToInt(x->x).min().getAsInt();
        System.out.println("Minimum==="+min);

    }

    public static void maxNumberInList(List<Integer> listInteger){
        int max=listInteger.stream().filter(x->x!=null).mapToInt(x->x).max().getAsInt();
        System.out.println("Minimum==="+max);

    }
    public static void avgInList(List<Integer> listInteger){
        Double max=listInteger.stream().filter(x->x!=null).mapToDouble(x->x).average().getAsDouble();
        System.out.println("Average==="+max);

    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,100,55,66,99);
        //   list.sort(Comparator.nullsLast((a,b)->b-a));
        System.out.println(list.stream().sorted(Comparator.nullsLast((a,b)->b-a)).collect(Collectors.toList()));
        System.out.println("==="+list);
        SortListInJava8.sumOfList(list);
        SortListInJava8.minNumberInList(list);
        SortListInJava8.maxNumberInList(list);
        avgInList(list);

        List<String> l = new ArrayList<>();
        l.add("karthik");
        List<String> l2 = new ArrayList<>();
        l2.add("kannan");
        l.addAll(l2);

        System.out.println("==l"+l);
        List<String> l3 = new ArrayList<>(l);
        System.out.println("==l3"+l3);


    }


}