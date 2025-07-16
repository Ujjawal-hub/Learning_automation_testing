package _4julytask;

public class program3super {
    public static void main(String[] args) {

        Jrcop g = new Jrcop();
        System.out.println(g.Bullet);


    }

}


class Cop {

    int bullet =100;

}


class Jrcop  extends Cop{

    int Bullet = super.bullet;

}