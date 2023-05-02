import java.util.Scanner;

// Bài 6: Tính S(n) = 1/1×2 + 1/2×3 +…+ 1/n x (n + 1)   
public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double n;
        do {
            System.out.println("nhap vao so n bat ki");
            n = sc.nextDouble();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            sum += 1.0/(i*(i+1));
        }

        System.out.println("tong ket qua cua phep tinh la " + sum);
        sc.close();
    }
}
