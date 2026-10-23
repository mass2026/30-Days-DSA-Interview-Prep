public class LongestSumSubArray {
    
    public int findLongestSubarrysSum(int arr[],int k){


        // int[] prefixSum = new int[arr.length];
        //  prefixSum[0] = arr[0];

        //  for(int i=1;i<arr.length;i++){
        //     prefixSum[i] = prefixSum[i-1]+ arr[i];
        //  }

        // // outer loop for start index
        // for(int i=1; i<prefixSum.length; i++){
            
        // }
        // return  0;



        //Brute Force Approach
           int count=0;
        for(int i=0; i<arr.length; i++){

            int sum=0;

            for(int j=i; j<arr.length; j++){

                 sum = sum+arr[j] ;

                if(sum == k){
                    // int startIndex =i;
                    // int endIndex =j;
                     count++;
                }
               
            }
            
        }
        return count;
    }

    public static void main(String args[]){
      
        LongestSumSubArray l1 =new LongestSumSubArray();
        int count = l1.findLongestSubarrysSum(new int[]{1, -1, 1, -1}, 0);
        System.out.println(count);
    }
}
