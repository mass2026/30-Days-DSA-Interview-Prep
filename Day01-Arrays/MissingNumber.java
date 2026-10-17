public class MissingNumber {

    public int findMissingNumber(int arr[]) {
        int actualSum = 0;
        //find Actual Sm 
        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }
        
        //for finding expected sum find out largest element in array 
        
        int n =arr.length;
        int expectedSum= n*(n+1)/2;
       
        int missingNumber = expectedSum -actualSum  ;

        return missingNumber;
    }

    public static void main(String args[]) {
     
       MissingNumber m1 = new MissingNumber();
      int missingNumber=  m1.findMissingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
      System.out.println("Missing Number from given array is  : "+missingNumber);

    }
}
