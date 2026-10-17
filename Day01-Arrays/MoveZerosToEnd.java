import java.util.Arrays;

public class MoveZerosToEnd {

    public int[] zeroAtEnd(int arr[]){

        int index =0;
        for(int i=0; i<arr.length; i++){

            if( arr[i] != 0){
              arr[index] = arr[i];
              index++;
            }
        }
          while (index < arr.length ) {
                arr[index] =0;
                index++;
            }

        return arr;
    }

 public static void  main(String args[]){
     
     MoveZerosToEnd z1 = new  MoveZerosToEnd();
     int[] zeroEndArray= z1.zeroAtEnd(new int[]{0, 1, 0, 3, 12});
     System.out.println("Given Array with zeroes at end : "+Arrays.toString(zeroEndArray));
 }
}
