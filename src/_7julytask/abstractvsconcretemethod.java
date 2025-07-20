package _7julytask;

public class abstractvsconcretemethod {

    public static void main(String[] args) {
        child s = new child();
        s.show();
        s.display();
    }
}

abstract class parent{

    abstract void show();


    void display(){

        System.out.println("this is a dispaly");

    }
}


class child extends parent{


    @Override
    void show() {
        System.out.println("show");
    }
}