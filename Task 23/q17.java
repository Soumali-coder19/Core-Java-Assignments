//Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)

import java.util.Scanner;

public class q17 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter credit score: ");
        int credit_score = sc.nextInt();
        sc.close();

        if(ageOk(age) && salaryOk(salary) && credit_scoreOk(credit_score)) System.out.println("Eligible for loan!");
        else System.out.println("Not eligible for loan!");

    }

    public static boolean ageOk(int age){
        return (age>=18 && age<=80);
        
    }

    public static boolean salaryOk(int salary){
        return (salary>=30000);
    }

    public static boolean credit_scoreOk(int credit_score){
        return (credit_score>=650 && credit_score<=850);
    }
}
