import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lop {
    private List<HocSinh> hocsinhs;

    public Lop() {
        hocsinhs = new ArrayList<HocSinh>();
    }
    public void addHocSinh(HocSinh hocsinh) {
        hocsinhs.add(hocsinh);
    }

    public void showHocSinh() {
        this.hocsinhs.forEach(hocsinh -> System.out.println(hocsinh.toString()));
    }

    public List<HocSinh> getHocSinh20T() {
        return this.hocsinhs.stream().filter(hocsinh -> hocsinh.getTuoi() == 20).collect(Collectors.toList());
    }

    public long getHocSinhDN23t() {
        return  this.hocsinhs.stream().filter(hocSinh -> hocSinh.getTuoi() == 23).count();
    }
}
