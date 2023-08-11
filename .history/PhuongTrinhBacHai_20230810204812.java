import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        double a, b, c, delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri phuong trinh :");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        delta = Math.pow(b, 2) + 4 * a * c;
        try {
            if (a != 0) {
                if (delta < 0)
                    System.out.println("Phuong Trinh Vo Nghiem");
                else if (delta == 0)
                    System.out.println("Phuong Trinh co 1 nghiem duy nhat: " + (-b / 2 * a));
                else
                    System.out.println("Phuong Trinh co 2 nghiem phan biet: " + ((-b - Math.sqrt(delta)) / 2 * a) + " "
                            + ((-b + Math.sqrt(delta)) / 2 * a));
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("DU LIEU SAI");
        }
    }
}
