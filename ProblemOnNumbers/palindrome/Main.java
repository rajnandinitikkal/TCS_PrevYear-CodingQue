package ProblemOnNumbers.palindrome;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int reversedNumber = 0;
        int temp = value;

        while(temp < 0){
            int lastDigit = temp % 10;
            reversedNumber = reversedNumber *10 + lastDigit;
            temp = temp /10;
        }
        sc.close();
        if(value == reversedNumber){
        System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
   
    }
}
