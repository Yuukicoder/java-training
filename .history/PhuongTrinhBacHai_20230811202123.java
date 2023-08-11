import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        double arr1[], arr2[]; // todo: declare array
        int s = 0, s1 = 0;
        arr1 = new double[5]; // todo: set the number of elements in array
        arr2 = new double[] { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            arr1[i] = sc.nextDouble(); // todo: enter the value of elements
            s += arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            s1 += arr2[j];
        }
        System.out.println("Tong 1" + s);
        System.out.println("Tong 2" + s1);

    }
}
