package _4julytask;

public class praogram4private {
    public static void main(String[] args) {

        superman kalel = new superman();
        System.out.println(kalel.getPower());


    }
}



class superman{

 private int power = 1000;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}


