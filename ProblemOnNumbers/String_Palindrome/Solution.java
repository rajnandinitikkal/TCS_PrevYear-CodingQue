package ProblemOnNumbers.String_Palindrome;
// import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        A.charAt(50);
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrome = true;
    
        for(int i=0; i<=A.length(); i++){
           if(A.charAt(i) != A.charAt(A.length()-1 -i)){
            isPalindrome = false;
            break;
           }
        }
        if(isPalindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
        
    }
}