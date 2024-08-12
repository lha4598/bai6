import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lop lop = new Lop();
        while (true) {
            System.out.println("-----MENU-----");
            System.out.println("1. Thêm học sinh mới ");
            System.out.println("2. Hiển thị thông tin mỗi học sinh ");
            System.out.println("3. Hiển thị các học sinh 20 tuổi ");
            System.out.println("4. Hiển thị số lượng học sinh quê DN tuổi 23 ");
            System.out.println("5. Thoát");
            int chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    HocSinh hocsinh = new HocSinh();
                    hocsinh.nhap();
                    lop.addHocSinh(hocsinh);
                    break;
                }
                case 2: {
                    lop.showHocSinh();
                    break;
                }
                case 3: {
                    lop.getHocSinh20T().forEach(System.out::println);
                    break;
                }
                case 4: {
                    System.out.println("Số lượng học sinh theo yêu cầu là : " lop.getHocSinhDN23t());
                    break;
                }
                case 5: {
                    return;
                }
            }
        }
    }
}