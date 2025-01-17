import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr1[] = {1,2,4,7,7,5};
        int n = arr1.length;
        System.out.println("Second smallest: "+sort(arr1));
        System.out.println("Second largest: "+sort(arr1));
        
        int arr2[] = {1};
        int n1 = arr1.length;
        System.out.println("Second smallest: "+sort(arr2));
        System.out.println("Second largest: "+sort(arr2));
        
    }
    private static int sort(int[] arr){
        Arrays.sort(arr);
        if(arr.length > 1){return arr[1];}else{return arr[0];}
       
    }
    
}
