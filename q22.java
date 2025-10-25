//Check if a Number is Divisible by 5 and 11
import java.util.*;
public class q22 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if(num%5==0 && num%11==0)
            System.out.println("Number is divisible by 5 and 11.");
        else
            System.out.println("Number is not divisible by 5 and 11.");

        sc.close();

    }
}
