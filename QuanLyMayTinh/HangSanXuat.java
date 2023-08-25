package QuanLyMayTinh;

public class HangSanXuat {
    // =================== Attributes ===================
    private String tenHang;
    private QuocGia quocGia;

    // ================== Constructor ====================
    public HangSanXuat(String tenHang, QuocGia quocGia) {
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }

    // ================= Getter && Setter ===============
    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }

}
