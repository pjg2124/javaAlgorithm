import java.util.Scanner;

public class Baekjoon1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int fin = N;
        int a, b;
        int count = 0;

        while (true) {
            count++;
            a = N / 10;
            b = N % 10;

            N = 10 * b + (a + b) % 10;

            if (fin == N)
                break;
        }
        System.out.println(count);
    }
}
