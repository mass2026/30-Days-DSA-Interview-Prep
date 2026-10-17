import java.util.Arrays;

public class FindMaxMin{
     
    
  public int findMax(int arr[]){
    
    int max =arr[0]; 

    for(int i=1; i<arr.length; i++){
         if(arr[i]> max){
            max = arr[i];
       }
    }
    return max;
  }

  public int findMin(int arr[]){
    
    int min =arr[0];
    
    for(int i=1; i<arr.length; i++){
        if (arr[i] < min) {
            min = arr[i];
        }
    }

    return min;
  }

  public int[] finMinAndMax(int arr[]){
    
     int min = arr[0];
     int max =arr[0];

    for(int i=1; i<arr.length; i++){
      
        if (arr[i]> max) {
            max = arr[i];
        }
        if(arr[i]<min){
            min = arr[i];
        }
    }
      int minAndMax[]={min,max};
    return minAndMax ;
  }

    public static void main(String args[]){
         
        // FindMaxMin maxEl = new FindMaxMin();
        // int maxNum = maxEl.findMax(new int[] {-7, -2, -9, -4, -1, -6});
        // System.out.println("Max Element from given array is :" +maxNum );

        // FindMaxMin minEl = new FindMaxMin();
        // int minNum = minEl.findMin(new int[] {-7, -2, -9, -4, -1, -6});
        // System.out.println("Min Element from given array is :" +minNum);

        int min ;
        int mx;
        FindMaxMin minAndMaxEl = new FindMaxMin();
        int minMaxEl[] = minAndMaxEl.finMinAndMax(new int[] {-7, -2, -9, -4, -1, 6});
        System.out.println("Min Element from given array is :"  + Arrays.toString(minMaxEl));
    
    }
}            