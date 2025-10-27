//package Task 23;
//Check if a Number is an Armstrong Number.
import java.util.*;
public class q16 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();

        //count number of digits
        int totalDigits = 0;
        int tempNum = num;
        while (tempNum!=0) {
            tempNum/=10;
            totalDigits++;
        }

        //calculate sum of power of digits
        tempNum = num;
        int sum = 0;
        while(tempNum!=0){
            int digit = tempNum%10;
            sum += Math.pow(digit, totalDigits);
            tempNum/=10;
        }

        if(sum==num) System.out.println("Armstrong number!");
        else System.out.println("Just a boring number");
    }
}
