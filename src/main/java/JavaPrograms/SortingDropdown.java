package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDropdown {

    public static void sortingDropdownValues(){
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Ball");
        l1.add("Apple");
        l1.add("Coffee");
        System.out.println(l1);
        ArrayList<String> l2=  (ArrayList<String>)l1.clone();
        System.out.println(l2);
        Collections.sort(l2);
        System.out.println("after sorting l1=="+l1);
        System.out.println("after sorting l2=="+l2);
        System.out.println(l1.equals(l2));

    }

    public static void main(String[] args) {
        sortingDropdownValues();
    }
}