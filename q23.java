//Convert Days into Years, Months, and Days.

import java.util.*;

public class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int totalDays = sc.nextInt();
        int years = totalDays/365;
        int remDays = totalDays%365;

        int months = remDays/30;
        remDays = remDays%30;
        sc.close();
        System.out.println("Total days approximately divided into years, months and days as follows:");
        System.out.println(years+" years");
        System.out.println(months+" months");
        System.out.println(remDays+" days");
    }
}
