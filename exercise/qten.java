package exercise;

public class qten {
    public static void main(String[] args) {
        // * Fibonacci series -> n, n + (n-1)
        int arr[] = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
