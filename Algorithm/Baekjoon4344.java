import java.util.Scanner;

public class Baekjoon4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int[] arr;

        for (int i = 0; i < C; i++) {
            int N = sc.nextInt();
            arr = new int[N];
            int count = 0;
            double sum = 0;

            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            double avg = sum / N;

            for (int j = 0; j < N; j++) {
                if (arr[j] > avg)
                    count++;
            }
            double a = (double) count / N * 100;
            System.out.printf("%.3f%%\n", a);
        }
        sc.close();
    }
}
