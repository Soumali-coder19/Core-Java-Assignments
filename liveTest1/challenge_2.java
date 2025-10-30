package liveTest1;

import java.util.Scanner;

public class challenge_2 {
    public static void main(String[] args) {
        System.out.println("Enter 2 integers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int sub = a-b;
        int mod = a%b;
        int prod = a*b;
        int div = a/b;
        sc.close();
        System.out.println("Addition: "+sum+" Subtraction: "+sub+" Multiplication: "+prod+" Diviion: "+div+" Modulus: "+mod);
    }
}
