   
package khohang;
import java.util.Scanner;

public class khohang {

    public String makho;
    public String diachi;
    public String danhsachsanpham;
    public String Sodienthoai;
    public String succhua;
    public khohang(){}
    public void Khohang(String makho, String diachi, String danhsachsanpham, String succhua, String sodienthoai) {
    	this.makho = makho;
        this.diachi = diachi;
        this.danhsachsanpham = danhsachsanpham;
        this.succhua = succhua;
        this.Sodienthoai = sodienthoai;
    }

    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã kho: ");
        makho = sc.nextLine();

        System.out.print("Nhập địa chỉ kho hàng: ");
        diachi = sc.nextLine();

        System.out.print("Nhập danh sách sản phẩm trong kho: ");
        danhsachsanpham = sc.nextLine();

        System.out.print("Nhập số điện thoại liên hệ kho: ");
        Sodienthoai = sc.nextLine();

        System.out.println("Nhập sức chứa của kho :");
        succhua = sc.nextLine();
    }

    public void xuatthongtin() {
        System.out.println("Mã kho: " + makho);
        System.out.println("Địa chỉ kho hàng: " + diachi);
        System.out.println("Sản phẩm có trong kho: " + danhsachsanpham);
        System.out.println("Số điện thoại liên hệ kho: " + Sodienthoai);
        System.out.println("Sức chứa của kho :" + succhua);
    }

    public static void main(String[] args) {
    	  khohang kho = new khohang();
          kho.nhapthongtin();
          kho.xuatthongtin();
    }
}
