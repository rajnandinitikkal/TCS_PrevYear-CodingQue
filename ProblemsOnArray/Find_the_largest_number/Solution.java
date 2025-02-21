// import java.util.Arrays;
// public class Main {
//     public static void main(String[] args) {

//         int arr1[] = { 2, 5, 1, 3, 0 };
//         System.out.println("The largest number in the array is : " + sort(arr1));

//         int arr2[] = { 8, 10, 5, 7, 9 };
//         System.out.println("The largest number in the array is : " + sort(arr2));

//     }

//     static int sort(int arr[]) {

//         Arrays.sort(arr);
//         return (arr[arr.length - 1]);
        
//     }
// }

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int A1 = A.length();
        int B1 = B.length();

        int sum = A1 + B1;
        System.out.println(sum);

        if(A1>B1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        String capitalizedA = A.substring(0,1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(capitalizedA + " " + capitalizedB);
        
        sc.close();
        
    }
}
