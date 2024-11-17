package JavaPrograms;

public class PalindromeString {
    public static void getPalinDrome1(String input){
        String[] str=input.split("");
        String pal="";
        for(int i=str.length-1;i>=0;i--){
            pal=pal+str[i];
        }
        if (pal.equals(input)){
            System.out.println("it is palindrome: "+pal);
        }
        else{
            System.out.println("it is not palindrome");
        }

    }

    public static void getPalinDrome2(String input){
        boolean flag= true;
        for(int i=0;i<input.length()/2;i++){
            if(input.charAt(i)!=input.charAt(input.length()-i-1)){
                flag=false;
            }
        }
        if(flag){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is  NOT palindrome");
        }


    }
    public static void main(String[] args) {
        /// PalindromeString.getPalinDrome1(("ramar"));
        PalindromeString.getPalinDrome2(("liril"));
    }
}