import java.util.ArrayList;
import java.util.Scanner;

// Lớp KhachHang lưu thông tin hộ sử dụng điện
class KhachHang248 {
    private String hoTen248;
    private String soNha248;
    private String maCongTo248;

    public void nhap248(Scanner sc248) {
        System.out.print("Nhập họ tên chủ hộ: ");
        hoTen248 = sc248.nextLine();
        System.out.print("Nhập số nhà: ");
        soNha248 = sc248.nextLine();
        System.out.print("Nhập mã số công tơ: ");
        maCongTo248 = sc248.nextLine();
    }

    public void hienThi248() {
        System.out.println("Họ tên chủ hộ: " + hoTen248);
        System.out.println("Số nhà: " + soNha248);
        System.out.println("Mã số công tơ: " + maCongTo248);
    }

    public String getHoTen248() {
        return hoTen248;
    }
}

// Lớp BienLai quản lý thông tin sử dụng và thanh toán tiền điện
class BienLai248 {
    private KhachHang248 khachHang248;
    private int chiSoCu248;
    private int chiSoMoi248;

    public void nhap248(Scanner sc248) {
        khachHang248 = new KhachHang248();
        System.out.println("== Nhập thông tin khách hàng ==");
        khachHang248.nhap248(sc248);

        System.out.print("Nhập chỉ số cũ: ");
        chiSoCu248 = Integer.parseInt(sc248.nextLine());
        System.out.print("Nhập chỉ số mới: ");
        chiSoMoi248 = Integer.parseInt(sc248.nextLine());
    }

    public void hienThi248() {
        System.out.println("\n=== Biên lai tiền điện ===");
        khachHang248.hienThi248();
        System.out.println("Chỉ số cũ: " + chiSoCu248);
        System.out.println("Chỉ số mới: " + chiSoMoi248);
        System.out.println("Số tiền phải trả: " + tinhTien248() + " VND");
    }

    public int tinhTien248() {
        return (chiSoMoi248 - chiSoCu248) * 750;
    }
}

// Chương trình chính
public class Main {
    public static void main(String[] args) {
        Scanner sc248 = new Scanner(System.in);
        ArrayList<BienLai248> dsBienLai248 = new ArrayList<>();

        System.out.print("Nhập số hộ sử dụng điện: ");
        int n248 = Integer.parseInt(sc248.nextLine());

        for (int i = 0; i < n248; i++) {
            System.out.println("\n--- Nhập biên lai cho hộ thứ " + (i + 1) + " ---");
            BienLai248 bl248 = new BienLai248();
            bl248.nhap248(sc248);
            dsBienLai248.add(bl248);
        }

        System.out.println("\n=== Danh sách biên lai tiền điện ===");
        for (BienLai248 bl248 : dsBienLai248) {
            bl248.hienThi248();
        }
    }
}
