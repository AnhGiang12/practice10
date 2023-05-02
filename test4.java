import java.util.Scanner;

// ham: Tìm số nguyên dương n nhỏ nhất sao cho 1 + 2 + … + n > 10000

public class test4 {
    public static int timSoNguyenDuong() {
        int n = 0;
        int sum = 0;
        while (sum <= 10000) {
            n++;
            sum += n;
        }
        return n;
    }

    public static void main(String[] args) {
        int ketQua = timSoNguyenDuong();
        System.out.println("so nguyen duong n nho nhat la " + ketQua);
    }
}
