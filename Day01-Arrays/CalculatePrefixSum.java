
// A prefix sum array stores the cumulative sum of elements from index 0 through each index i.

// For an input array arr:
// \[
// prefix[i] = prefix[i-1] + arr[i]
// \]

public class CalculatePrefixSum {

    public int[] findPrefixSum(int arr[]) {

        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {

            prefixSum[i] = prefixSum[i - 1] + arr[i];

        }

        return prefixSum;
    }

    public int rangeSum(int[] prefixSum, int left, int right) {

        if (left == 0) {
            int sum = prefixSum[right];
            return sum;
        } else {
            int sum = prefixSum[right] - prefixSum[left - 1];
            return sum;
        }
    }

    public static void main(String args[]) {
        int[] arr = { 2, 4, 1, 7, 3 };

        CalculatePrefixSum calculator = new CalculatePrefixSum();

        int[] prefix = calculator.findPrefixSum(arr);

        System.out.println(calculator.rangeSum(prefix, 0, 2)); // 7
        System.out.println(calculator.rangeSum(prefix, 2, 4)); // 11
    }
}