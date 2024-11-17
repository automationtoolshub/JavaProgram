package JavaPrograms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PalindromeLink {

    public static boolean isPalinDrome(List<Integer> link){
        System.out.println("Link==="+link);
        Stack<Integer> stack = new Stack<>();
        for(Integer in : link){
            stack.push(in);
        }
        System.out.println("stack=="+stack);
        for(Integer in : link){
            System.out.println("peek value==="+stack.peek());
            if(in==stack.peek()){
                stack.pop();
                System.out.println("===="+stack);
            }
            else{
                System.out.println("===="+stack);
                return false;
            }
        }
        return stack.size()==0;
    }

    public static void main(String[] args) {
        boolean palin=isPalinDrome(new LinkedList<>(Arrays.asList(1,2,3,null,3,2,1,null)));
        System.out.println(palin);
    }
}