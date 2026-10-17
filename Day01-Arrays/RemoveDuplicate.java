public class RemoveDuplicate{
    
    public int[] removeDuplicate(int arr[]){
         int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[position++] = arr[i];
            }
        }
        return java.util.Arrays.copyOf(arr, position);
    }
    public static void main(String args[]){

    }
}