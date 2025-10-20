import java.util.Scanner;

public class no6 {
    
    public static void main(String[] args) {

        int[] data = {1, 2, 3, 4, 5, 6};
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah langkah rotasi (k): ");
        int k = input.nextInt();

        int n = data.length;
        k = k % n; 
        reverse(data, 0, n - 1);
        reverse(data, 0, k - 1);
        reverse(data, k, n - 1);

        System.out.print("Array setelah rotasi: ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        input.close();
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

            
        }
    }
}

