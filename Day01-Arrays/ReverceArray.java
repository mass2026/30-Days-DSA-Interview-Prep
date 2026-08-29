import java.util.Arrays;

public class ReverceArray {
    
    public int[] reverceArray(int[] arr){
  
        int left =0;
        int right = arr.length-1;
        int temp;
        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right--;
        }
        return  arr;
    }

    public static void main(String args[]){
      
        int arr[] ={10, 25, 7, 40, 18};
        ReverceArray r = new ReverceArray();
        System.out.println(Arrays.toString(r.reverceArray(arr)));
    }
}
