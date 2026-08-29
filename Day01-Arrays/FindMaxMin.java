public class FindMaxMin{
     
    // public int findMax(int arr[]){
       
    //     int max = arr[0];
       
    //     for(int i=1;i<arr.length;i++){
            
    //         if(max < arr[i]){
    //             max =arr[i];
    //         }
    //     }
    //     return max;
    // }

    // public int findMin(int arr[]){
       
    //     int min = arr[0];
    
    //     for(int i=1;i<arr.length;i++){
            
    //         if(min > arr[i]){
    //             min =arr[i];
    //         }
    //     }
    //  return min;
       
    // }

    public int[] findMinAndMax(int arr[]){
     
        int max=arr[0];
        int min=arr[0];

        for(int i=1;i<arr.length;i++){
          
            if(max <arr[i]){
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return new int[] {min ,max};
    }

    public static void main(String args[]){
         
        int[] arr = {10, 25, 7, 40, 18};
        FindMaxMin x = new FindMaxMin();
        // int result =x.findMax(arr);
        // int minResult =x.findMin(arr);
         int[] result = x.findMinAndMax(arr);
         System.out.println("Maximum = "+result[1]);
          System.out.println("Minimum = "+result[0]);
        // System.out.println("Maximum = " +result +"minimum is ="+minResult);
    }
}            