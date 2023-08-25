package BanCaFe;

public class BanCaFe {
    public static void main(String[] args) {
        HoaDonCaFe hd = new HoaDonCaFe("Vina", 200000, 12);
        System.out.println("Hoa Don : " + hd.TinhTongTien());
        // Kiem tra khoi luong cafe cua tui co lon hon 1 so dc dua vao phuong thuc ko?
        System.out.println(hd.KiemTraKhoiLuongLonHon(12) == true ? "nang hon trung binh" : "nhe hon trung binh");
        // Kiem tra gia tien cua hoa don co lon hon 500000 ko?
        System.out.println(hd.KiemTraGiaTien() == true ? "re hon tieu chuan" : "dat hon tieu chuan");
        // Tinh so tien giam gia, giam x% cho cac hoa don co gia tri lon hon 500000
        System.out.println("Khuyen Mai: " + (hd.TinhTongTien() > 500000 ? hd.GiamGiaHoaDonLonHon50(10) : 0));
        // Tinh so tien khach phai tra sau khi giam gia
        System.out.println("Khac phai tra: " + hd.SoTienPhaiTraSauGiamGia(10));

    }
}