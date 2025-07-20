package _7julytask;

public class interfacepoly {
    public static void main(String[] args){

        guitar g =new guitar();
        piano p =new piano();
        g.play();
        p.play();


    }


}



interface playble{

    void play();

}

class guitar implements playble{

    public void play(){

        System.out.println("playing guiter");
    }

}


class piano implements playble{


      public void play(){

        System.out.println("playing piano");

    }

}



