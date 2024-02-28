package BTVN;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        int luaChon;
        do {
            System.out.println("============Menu===========");
            System.out.println("1. Nhập thông tin sản phẩm");
            System.out.println("2. Hiển thị thông tin sản phẩm");
            System.out.println("3. Hiển thị lợi xuất");
            System.out.println("4. Thoát");
            System.out.println("Nhập lựa chọn của bạn:");

            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    product.nhapThongTinSanPham();
                    break;
                case 2:
                    product.hienThiThongTinSanPham();
                    break;
                case 3:
                    double loiXuat = product.tinhLoiXuat();
                    System.out.println("Lợi xuất: " + loiXuat);
                    break;
                case 4:
                    System.out.println("Đang thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập số từ 1 đến 4.");
            }
        } while (luaChon != 4);
    }
}
