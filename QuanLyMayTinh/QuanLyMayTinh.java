package QuanLyMayTinh;

public class QuanLyMayTinh {
    public static void main(String[] args) {

        QuocGia qg = new QuocGia(9999, "VietNam");
        HangSanXuat hsx = new HangSanXuat("Yuuki", qg);
        NgaySanXuat nsx = new NgaySanXuat(2, 1, 2004);
        MayTinh mt = new MayTinh(hsx, nsx, 120000, 12);
        System.out.println(mt.soSanhGiaBan(mt));
        System.out.println(mt.checkTenQuocGia());
    }
}
