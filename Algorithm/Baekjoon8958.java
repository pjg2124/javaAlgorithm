import java.util.Scanner;

public class Baekjoon8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            String str = sc.next();
            int count = 0;
            int score = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    count++;
                    score += count;
                }
                else {
                    count = 0;
                }
            }

            sc.close();
            System.out.println(score);
        }
    }
}
