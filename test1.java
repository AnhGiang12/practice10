import java.util.Scanner;

//Bài 5: Tính S(n) = 1 + 1/3 + 1/5 + … + 1/(2n + 1)

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0;
        do {
            System.out.println("nhap vao so tu nhien");
            n = sc.nextInt();
        } while (n < 0);

        for (int i = 1; i <= n; i++) {
            sum += 1.0/(2*i+1);
        }
        System.out.println("tong cua phep tinh la " + sum);
        sc.close();
    }
}