import java.util.*;

public class q25 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an age: ");
        int age = sc.nextInt();
        if(age<12) System.out.println("Child");
        else if (age>=12 && age<=19) System.out.println("Teenager");
        else if (age>=20 && age<=64) System.out.println("Adult");
        else System.out.println("Senior citizen");
        sc.close();
    }
}
