package QuanLyMayTinh;

public class QuocGia {
    // =============== Attributes ================
    private double maQuocGia;
    private String tenQuocGia;

    // ================ Constructor ==================
    public QuocGia(double maQuocGia, String tenQuocGia) {
        this.maQuocGia = maQuocGia;
        this.tenQuocGia = tenQuocGia;
    }

    // ============== Getter && Setter =================
    public double getMaQuocGia() {
        return maQuocGia;
    }

    public void setMaQuocGia(double maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

}
