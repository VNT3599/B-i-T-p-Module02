package BTVN;
import java.util.Scanner;
public class Product {
    private String maSanPham;
    private String tenSanPham;
    private double giaBan;
    private double giaNhap;

    // Constructor không có tham số
    public Product() {}

    // Constructor với tất cả các tham số
    public Product(String maSanPham, String tenSanPham, double giaBan, double giaNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
    }

    // Các phương thức Getter và Setter
    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    // Phương thức nhập thông tin sản phẩm
    public void nhapThongTinSanPham() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm:");
        this.maSanPham = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm:");
        this.tenSanPham = scanner.nextLine();
        System.out.println("Nhập giá bán:");
        this.giaBan = scanner.nextDouble();
        System.out.println("Nhập giá nhập:");
        this.giaNhap = scanner.nextDouble();
    }

    // Phương thức hiển thị thông tin sản phẩm
    public void hienThiThongTinSanPham() {
        System.out.println("Mã sản phẩm: " + maSanPham);
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Giá nhập: " + giaNhap);
    }

    // Phương thức tính lợi xuất
    public double tinhLoiXuat() {
        return giaBan - giaNhap;
    }
}
