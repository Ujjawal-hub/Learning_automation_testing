package test1;

public class _4 {
    public static void main(String[] args) {
        //Original: 5 Pre-increment: 6 Post-increment: 6 (returned 6) Pre-decrement: 5 Post-decrement: 5 (returned 5)

        int a = 5;
        System.out.println("Original:" +a);
        System.out.println(" Pre-increment:"+(++a) );

        System.out.println("Post-increment:" +(a++));

        a=6;

        System.out.println(" Pre-decrement:" +(--a));
        System.out.println("Post-decrement: "+(a--));
    }
}
