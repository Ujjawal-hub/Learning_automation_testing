package _7julytask;

public class multipleinhertanceusinginterface {

    public static void main(String[] args) {
        document d =new document();
        d.printe();
        d.show();
    }
}

interface printable{


    void printe();

}

interface showable{

        void show();

}


class document implements printable,showable{


    @Override
    public void show() {
        System.out.println("it is printing");
    }


    @Override
    public void printe() {
        System.out.println("it is showing");
    }
}


