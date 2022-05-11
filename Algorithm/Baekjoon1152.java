import java.util.Scanner;

public class Baekjoon1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        str = str.trim();
        String[] arr = str.split(" ");

        if (arr[0].equals(""))
            System.out.println(0);
        else
            System.out.println(arr.length);
    }
}
