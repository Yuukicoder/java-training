package Date2;

public class Date2 {
    public static void main(String[] args) {
        MyDate md = new MyDate(1, 12, 3);
        System.out.println(md.getMonth());
        md.setMonth(14);
        System.out.println(md.getMonth());
        System.out.println(md.toString());
    }
}
