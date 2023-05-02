
// Bài 87: Tìm số nguyên dương n nhỏ nhất sao cho 1 + 2 + … + n > 10000
public class test3 {
    public static void main(String[] args) {
        int sum = 0, n = 0;
        while (sum <= 10000) {
            n++;
            sum += n;
        }
        System.out.println("so nguyen duong n nho nhat thoa man la " + n);
    }
}
