package _8julytask;

public class comparewrapperobject {
    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;


        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(c == d); //at 200 integer class create new object //,that same refence is not equal
        System.out.println(c.equals(d));

    }
}
