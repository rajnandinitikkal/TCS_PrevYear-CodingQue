package Top_100_codes.Java_Anagrams;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        boolean ret = true;
        System.out.println((ret) ? "Anagram" : "Not Anagram");

        sc.close();
    }
    static boolean isAnagram(String A, String B){
        A = A.replaceAll("\\s", "").toLowerCase();
        B = B.replaceAll("\\s", "").toLowerCase();

        if(A.length() != B.length()){
            return false;
        }

        int[] charCount = new int[26];

        for(int i=0; i<A.length(); i++){
            charCount[A.charAt(i) - 'a']++;
            charCount[B.charAt(i) - 'a']--;
        }

        for(int count: charCount){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
