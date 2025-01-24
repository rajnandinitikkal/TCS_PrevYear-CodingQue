package Tech_Mahindra_questions.coding_que2;

public class Main {
    public static int FindTotalDistance(int n, int[] arr){
        int totalDistance = 0;

        for(int i=0; i<n-1; i++){
            totalDistance += Math.abs(arr[i] - arr[i+1]);
        }
        return totalDistance;
    }

    public static void main(String[] args) {
        int [] arr = {10, 11, 7, 12, 14};
        int n = arr.length;

        int totalDistance = FindTotalDistance(n, arr);
        System.out.println("Output: " + totalDistance);
    }
}
