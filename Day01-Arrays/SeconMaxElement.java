public class SeconMaxElement {
    
    public int findSecondMax(int arr[]){
          
       
     int max = Integer.MIN_VALUE;
     int secondMax = Integer.MIN_VALUE;

        
       for(int i=0; i<arr.length; i++){
           
         if(max <arr[i]){
             secondMax = max;
             max = arr[i];
         }else if(secondMax <arr[i] && arr[i]!=max){
             secondMax = arr[i];
         }
       }
        return secondMax;
    }

    public static void main(String args[]){
        int arr[] = { 40, 40, 25, 10};
      SeconMaxElement x = new SeconMaxElement();
      int result = x.findSecondMax(arr);
      System.out.println("SecondMax Element is = "+result);
    }
}
