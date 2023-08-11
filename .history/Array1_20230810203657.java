import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        double arr1[]; // todo: declare array
        double arr2[];
        arr2 = new double[] { 1, 2, 3, 4, 5, 6 }; // todo: set the value of elements in array
        int s = 0;
        arr1 = new double[5]; // todo: set the number of elements in array
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            arr1[i] = sc.nextDouble(); // todo: enter the value of elements
            s += arr1[i];
        }
        System.out.println("Tong " + s);

    }

}
