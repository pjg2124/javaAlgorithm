import java.util.Scanner;

public class Baekjoon10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = -1000001;
        int min = 1000001;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            arr[i] = num;

            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }

        sc.close();
        System.out.print(min + " " + max);
    }
}
