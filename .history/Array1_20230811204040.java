import java.util.Scanner;

/**
 * Array1
 */
public class Array1 {
    public static void main(String[] args) {
        double a, b, c, delta, x, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri phuong trinh :");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;
        x = -b / (2 * a);
        x1 = (-b - Math.sqrt(delta)) / (2 * a);
        x2 = (-b + Math.sqrt(delta)) / (2 * a);
        try {
            if (a != 0) {
                if (delta < 0)
                    System.out.println("Phuong Trinh Vo Nghiem");
                else if (delta == 0)
                    System.out.println("Phuong Trinh co 1 nghiem duy nhat: " + x);
                else
                    System.out.println("Phuong Trinh co 2 nghiem phan biet: " + x1 + " " + x2);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("DU LIEU SAI");
        }
    }
}
