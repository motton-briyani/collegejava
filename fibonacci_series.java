import java.util.Scanner;

public class fibonacci_series
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the minimum value: ");
        int m = in.nextInt();
        System.out.print("Enter the maximum  value: ");
        int n = in.nextInt();
        in.close();
        int a = 0, b = 1;
        while (a <= n) {
            if (a >= m)
                System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
