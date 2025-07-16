package _4julytask;

public class STUDENTS {

    public void showinfo(){

        System.out.println("Public Access: Student Info.");


    }
}

class gg{

    public static void main(String[] args) {
        STUDENTS k = new STUDENTS();
        k.showinfo();
    }
}