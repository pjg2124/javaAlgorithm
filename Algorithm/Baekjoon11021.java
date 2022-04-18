import java.util.Scanner;

public class Baekjoon11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int arr[] = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            arr[i] = num1 + num2;
        }

        for (int j = 0; j < testCase; j++) {
            System.out.println("Case #" + (j+1) + ": " + arr[j]);
        }
    }
}
