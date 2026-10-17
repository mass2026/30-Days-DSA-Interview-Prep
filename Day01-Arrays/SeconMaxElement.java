public class SeconMaxElement {

    public int findSecondLargest(int arr[]) {

        int largest = arr[0];
        int secondLargest = -1;
        boolean foundSecondLargest = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr == null || arr.length < 2) {
                return -1;
            }
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
                foundSecondLargest = true;
            } else if (arr[i] < largest &&
                    (!foundSecondLargest || arr[i] > secondLargest)) {
                secondLargest = arr[i];
                foundSecondLargest = true;
            }
        }

        return foundSecondLargest ? secondLargest : -1;
    }

    public static void main(String args[]) {

        SeconMaxElement l1 = new SeconMaxElement();
        int secondLarge = l1.findSecondLargest(new int[] { 12, 35, 1, 10, 34});
        System.out.println("Second Largest Element from given Array is : " + secondLarge);

    }
}
