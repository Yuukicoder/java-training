import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        double arr1[]; // todo: declaring array
        int s = 0;
        arr1 = new double[5]; // todo:
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            arr1[i] = sc.nextDouble();
            s += arr1[i];
        }
        System.out.println("Tong " + s);

    }

}
