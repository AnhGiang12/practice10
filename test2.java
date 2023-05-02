import java.util.Scanner;

// ham : Bài 5: Tính S(n) = 1 + 1/3 + 1/5 + … + 1/(2n + 1)

public class test2 {

    public double tinhTong(double n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/(2*i+1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        test2 ts2 = new test2();
        System.out.println("nhap vao so n");
        double n = sc.nextDouble();
        double ketQua = ts2.tinhTong(n);
        System.out.println("ket qua cua phep tinh tong la " + ketQua);

    }
}
