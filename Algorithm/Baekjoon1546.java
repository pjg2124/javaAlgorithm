import java.util.Scanner;

public class Baekjoon1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];
        double max = 0;
        double score = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i])
                max = arr[i];
        }
        sc.close();
        for (int i = 0; i < N; i++) {
            score += (arr[i] / max) * 100;
        }

        System.out.println(score / N);

    }
}
