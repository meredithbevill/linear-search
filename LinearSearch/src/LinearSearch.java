public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found in the array
    }

    public static void main(String[] args) {
        // Replace this with your own data
        int[] myArray = {64, 34, 25, 12, 22, 11, 90};
        int target = 22;

        System.out.print("Original Array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        int result = linearSearch(myArray, target);

        if (result != -1) {
            System.out.println("\nTarget " + target + " found at index: " + result);
        } else {
            System.out.println("\nTarget " + target + " not found in the array.");
        }
    }
}
