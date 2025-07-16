package _4julytask;

public class protecte {
    public static void main(String[] args) {
     dog g =new dog();
     g.doeat();
    }
}


class animal {

protected void eats(){

    System.out.println(" i am eating");
}


}

class dog extends animal{

    void doeat(){

        super.eats();

    }


}