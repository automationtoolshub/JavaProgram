package JavaPrograms;

public class PalindromNumbers {

    public static void getPalindromeNum(int number){
        int num =number;
        int pal =0;
        while(num>0){
            int n=num%10;
            pal = pal*10+n;
            num=num/10;
        }
        System.out.println(pal);
        if(pal==number){
            System.out.println("given number is palindrome");
        }
        else{
            System.out.println("Given number is not palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromNumbers.getPalindromeNum(1511);
    }
}