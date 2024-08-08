public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 22, 10, 5, 60, 80, 90 }; // Example array

        int firstLargest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second largest element in the array is: " + secondLargest);
    }
}
