package JavaPrograms;

import java.util.Stack;

public class Balanced {

    public static boolean isBalanced(String input){

        if(null==input || input.length()%2!=0){
            return false;
        }
        else{
            for(char c:input.toCharArray()){
                if(!(c=='{'||c=='['||c=='('||c=='}'||c==']'||c==')')){
                    return false;
                }
            }
        }
        while(input.contains("()")||input.contains("[]")||input.contains("{}")){
            input= input.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");;
        }

        return (input.length()==0);

    }

    public static boolean isBalancedStack(String input) {
        Stack<Character> stack = new Stack<>();
        if (null == input || input.length() == 0) {
            return false;
        } else if (input.length() % 2 != 0) {
            return false;
        } else {
            for (char c : input.toCharArray()) {
                if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
                    return false;
                }
            }
            for (char c : input.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                    System.out.println("===stack=====" + stack);
                } else if (c == ')' || c == ']' || c == '}' && !stack.isEmpty()) {
                    char stackData = stack.peek();
                    if (stackData == '(') {
                        stack.pop();
                        System.out.println("pop==" + stack);
                    } else if (stackData == '{') {
                        stack.pop();
                        System.out.println("pop==" + stack);
                    } else if (stackData == '[') {
                        stack.pop();
                        System.out.println("pop==" + stack);
                    }
                } else {
                    return false;
                }

            }
            return stack.size() == 0;

        }
    }

    public static void main(String[] args){
        if(isBalancedStack(null)){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }

    }

}