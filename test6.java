import java.util.Scanner;

// ham: Bài 6: Tính S(n) = 1/1×2 + 1/2×3 +…+ 1/n x (n + 1)   

public class test6 {
    public double tinhTong(double n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/(i*(i+1));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so n bat ki");
        double n = sc.nextDouble();
        test6 ts6 = new test6();
        double ketQua = ts6.tinhTong(n);
        System.out.println("ket qua cua phep tinh la " + ketQua);
        sc.close();
    }
}
