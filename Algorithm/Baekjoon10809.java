import java.util.Scanner;

public class Baekjoon10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print(S.indexOf(i) + " ");
        }
    }
}
