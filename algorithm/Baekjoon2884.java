import java.util.Scanner;

public class Baekjoon2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        if (M < 45) {
            H--;
            if (H < 0)
                H += 24;
            System.out.println(H);
            System.out.println(M + 15);
        }
        else {
            System.out.println(H);
            System.out.println(M - 45);
        }
    }
}
