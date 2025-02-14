package ProblemsOnArray.Reverse_a_given_array;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("Original array:");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }

        System.out.print("Reverse array: ");
        for(int i=n-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }

    }
}
