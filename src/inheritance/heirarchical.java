package inheritance;

public class heirarchical {
    public static void main(String[] args) {
        Father1 f1 = new Father1();
        Ruhani r1 = new Ruhani();

        r1.home();
        f1.home();

        Pramod p1 = new Pramod();
        p1.home();

        Lucky l1 = new Lucky();
        l1.l2();
        l1.home();

    }
}

class Father1 {
    void home(){
        System.out.println("3BHK");
    }
}

class Pramod extends Father1 {
    void h2(){
        System.out.println("h2 - Pramod");
    }
}

class Lucky extends Father1 {

    void l2(){
        System.out.println("Lucky");
    }
}

class Ruhani extends Father1 {
    void r1(){
        System.out.println("ruhani");
    }



}
