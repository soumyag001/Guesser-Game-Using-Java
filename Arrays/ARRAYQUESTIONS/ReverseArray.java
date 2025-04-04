public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 200, 30, 40, 50, 60};

        System.out.print("Original Array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        // Reversing the array
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.print("\nReversed Array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
