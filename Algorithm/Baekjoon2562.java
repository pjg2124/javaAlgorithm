import java.util.Scanner;

public class Baekjoon2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int index = 0;
        int count = 0;

        for (int i : arr) {
            arr[i] = sc.nextInt();
            count++;

            if (max < arr[i]) {
                max = arr[i];
                index = count;
            }
        }
        sc.close();
        System.out.println(max + "\n" + index);
    }
}
