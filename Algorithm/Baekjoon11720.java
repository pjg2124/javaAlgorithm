import java.util.Scanner;

public class Baekjoon11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int N = sc.nextInt();
        String str = sc.next();
        sc.close();

        for (int i = 0; i < N; i++) {
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}