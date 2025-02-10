

public class maxSubarraySum {

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        System.out.println("\n"+sumStartToEnd(1, 2, arr));
    }

    static int  sumStartToEnd(int startI, int endI, int[] arr) {

        int[] prefixSum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            prefixSum[i] = ((i - 1 >= 0) ? prefixSum[i - 1] : 0) + arr[i];
        }
        for (int i : prefixSum) {
            System.out.println(""+i);
        }
        
        return prefixSum[endI] - prefixSum[startI - 1];
    }
}
