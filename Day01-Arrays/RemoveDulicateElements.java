import java.util.Arrays;

public class RemoveDulicateElements {

    public int removeDplicate(int arr[]) {
        int index = 0;
        if(arr.length ==0){
            return 0;
        }
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[index]) {
                index++;
               arr[index] = arr[i];
            }
        }
        return index+1;
    }

    public static void main(String args[]) {

        RemoveDulicateElements r1 = new RemoveDulicateElements();
        int original = r1.removeDplicate(new int[] { 1, 1, 2, 2, 3 });
        System.out.println("Given Array without Duplicates : " + original);
    }
}
