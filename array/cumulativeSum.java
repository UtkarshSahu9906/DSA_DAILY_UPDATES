public class cumulativeSum {
    public static void main(String[] args) {

        int[] array = {2, 3, 4, -3, 2};

        // Step 1: Calculate the cumulative sum array
        int[] cumSum = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                cumSum[i] = array[i];
            } else {
                cumSum[i] = array[i] + cumSum[i - 1];
            }
        }

        // Step 2: Find the maximum subarray sum
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                int sum;
                if (j == 0) {
                    sum = cumSum[i]; // If j is 0, the sum is simply cumSum[i]
                } else {
                    sum = cumSum[i] - cumSum[j - 1]; // Otherwise, use the cumulative sum formula
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        // Step 3: Print the maximum subarray sum
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}
