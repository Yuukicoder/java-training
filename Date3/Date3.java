package Date3;

public class Date3 {
    public static void main(String[] args) {
        MyDate md = new MyDate(1, 1, 3);
        MyDate md1 = new MyDate(1, 14, 3);
        MyDate md2 = new MyDate(1, 14, 3);
        md1.setMonth(14);
        System.out.println(md.getMonth());
        System.out.println(md.equals(md2));
        System.out.println(md.equals(md1));
        System.out.println(md2.equals(md1));
        System.out.println(md.hashCode());
    }
}
