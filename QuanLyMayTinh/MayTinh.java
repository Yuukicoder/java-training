package QuanLyMayTinh;

public class MayTinh {
    // ================ Attributes ===========
    private HangSanXuat hangSanXuat;
    private NgaySanXuat ngaySanXuat;
    private double giaBan;
    private int thoiGianBaoHanh;

    // ================== Constructor ================
    public MayTinh(HangSanXuat hangSanXuat, NgaySanXuat ngaySanXuat, double giaBan, int thoiGianBaoHanh) {
        this.hangSanXuat = hangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    // ============== Getter && Setter =====================

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public NgaySanXuat getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(NgaySanXuat ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    // ===================== Methods =====================
    public boolean soSanhGiaBan(MayTinh mtKhac) {
        return this.giaBan == mtKhac.giaBan;
    }

    public String checkTenQuocGia() {
        return this.hangSanXuat.getQuocGia().getTenQuocGia();
    }
}
