import java.util.Scanner;

public class Curs4p4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];


        for (int i = 0; i < n; ++i) {
            x[i] = sc.nextInt();
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++)
            if (x[i] != 0 && x[i] % 2 == 1) {
                a = a + 1;
                b = b + x[i];


        }

        System.out.println();


    }
}