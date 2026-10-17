import java.util.Arrays;

public class MaxSubArray {

    public int[] findMaxSubArray(int[] arr) {

        int maxSum = arr[0];
        int currentSum = arr[0];
        int start = 0;
        int bestStart = 0;
        int bestEnd = 0;
        for (int i = 1; i < arr.length; i++) {

            if (currentSum + arr[i] > arr[i]) {
                currentSum += arr[i];
               

            } else {
                currentSum = arr[i];
                //stores index
                start = i;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                 bestStart = start;
                bestEnd = i+1;//Exclusive index so we added 1
            }
        }

        return Arrays.copyOfRange(arr, bestStart, bestEnd);
    }

    public static void main(String args[]) {

        MaxSubArray m1 = new MaxSubArray();
        int[] maxSubArray = m1.findMaxSubArray(new int[] { -5, -2, -8});
        System.out.println(Arrays.toString(maxSubArray));

    }
}
