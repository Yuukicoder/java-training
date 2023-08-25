package BanCaFe;

public class HoaDonCaFe {
    // ============ Attributes ============
    private String TenLoaiCaFe;
    private double GiaTien1Kg;
    private double KhoiLuong;

    // =========== Constructor ===========
    public HoaDonCaFe(String name, double x1, double x2) {
        this.TenLoaiCaFe = name;
        this.GiaTien1Kg = x1;
        this.KhoiLuong = x2;
    }

    // ============ Methods =============
    public double TinhTongTien() {
        return this.GiaTien1Kg * this.KhoiLuong;
    }

    public boolean KiemTraKhoiLuongLonHon(double kl) {
        return this.KhoiLuong > kl;
    }

    public boolean KiemTraGiaTien() {
        return TinhTongTien() < 500000;
    }

    public double GiamGiaHoaDonLonHon50(double x) {
        return TinhTongTien() * x / 100;
    }

    public double SoTienPhaiTraSauGiamGia(double x) {
        return TinhTongTien() > 500000 ? TinhTongTien() - GiamGiaHoaDonLonHon50(x) : TinhTongTien();
    }

}
