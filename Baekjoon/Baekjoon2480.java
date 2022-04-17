import java.util.Scanner;

public class Baekjoon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int max = a;

        if (a == b && b == c && c == a)
            System.out.println(10000 + a * 1000);
        else if (a == b || b == c)
            System.out.println(1000 + b * 100);
        else if (a == c)
            System.out.println(1000 + a * 100);
        else {
            max = Math.max(max, b);
            max = Math.max(max, c);
            System.out.println(max * 100);
        }
    }
}
