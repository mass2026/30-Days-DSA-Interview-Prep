import java.util.Arrays;

public class ReverseArray {
    
    public int[] reversedArray(int arr[]){

        int left = arr.length - arr.length;
        int right =arr.length-1;
               
            while(right > left){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                 left++;
                right--;
            }
        return  arr;
    }
    

    public static void  main(String args[]){
       
        ReverseArray r1 = new ReverseArray();   
        int finalArray[] =r1.reversedArray(new int[] {1,2,3,4,5});
        System.out.println("Reversed Array of given Array is : " +Arrays.toString(finalArray));   
    }
   
}
