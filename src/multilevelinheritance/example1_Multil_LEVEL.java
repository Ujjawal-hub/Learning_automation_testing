package multilevelinheritance;


public class example1_Multil_LEVEL {
    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.gf();

        System.out.println(" -- ");

        multilevelinheritance.Father f1 = new Father();
        f1.f();
        f1.gf();

        System.out.println(" -- ");



        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();





    }
}