import java.util.Scanner;

public class Baekjoon3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        boolean bl;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt() % 42;
        }

        sc.close();

        for (int i = 0; i < 10; i++) {
            bl = true;
            for (int j = i + 1; j < 10; j++) {
                if (num[i] == num[j]) {
                    bl = false;
                    break;
                }
            }
            if (bl)
                count++;
        }
        System.out.println(count);
    }
}
