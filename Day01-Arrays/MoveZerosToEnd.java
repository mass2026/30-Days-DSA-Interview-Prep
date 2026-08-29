import java.util.Arrays;

public class MoveZerosToEnd {
     
      int position=0;
    public int[] moveZerosTOEnd(int[] arr){
        for(int i=0;i<arr.length;i++){
           //placing Non-Zero elements
            if(arr[i] != 0){
              arr[position] =arr[i];
              position++;
            }
        }

         //placing zero elements
        for(int j=position; j<arr.length;j++){
                arr[j]=0;          
        }
 
        return arr;
    }
    public static void main(String args[]){
        int arr[] = {0, 1, 0, 3, 12};
        MoveZerosToEnd mv = new MoveZerosToEnd();
        System.out.println(Arrays.toString(mv.moveZerosTOEnd(arr)));
    }
}
