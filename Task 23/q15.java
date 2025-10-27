//package Task 23;

//Check if a Number is a Palindrome
import java.util.*;

public class q15 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(isPalindrome(num)) System.out.println("Palindrome!");
        else System.out.println("just a boring number");
        sc.close();
    }

    public static boolean isPalindrome(int num) {
        int oriNum = num;
        int reverseNum = 0;
        int remainder = 0;
        
        while(num>0) {
            remainder = num%10;
            reverseNum = reverseNum*10 + remainder;
            num/=10;
        }
        return oriNum==reverseNum;
    }
}