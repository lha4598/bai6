import java.util.Scanner;

public class HocSinh {
    private String ten,que;
    private int tuoi;

    public HocSinh() {

    }

    public HocSinh(String ten, String que, int tuoi) {
        this.ten = ten;
        this.que = que;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập quê quán: ");
        que = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Tên: " + ten + ", Quê quán: " + que + ", Tuổi: " + tuoi;
    }
}
