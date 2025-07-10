package singleinhertance;

public class inheritance {


    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.bhk2();
        s1.bhk3();

        Father f2 = new Son();

        System.out.println(f2.gold_f);
        f2.bhk2();
       // f2.bhk3();


    }


}

    class Father{
        int gold_f  = 1000; // Attribute | Data variables |  Property | Instance Variables

        void bhk2() { //  Behaviour |  Method | Function | Data members
            System.out.println("Father - 2BHK");
        }

    }

    class Son extends Father{


//    int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables
//
//    void bhk2() { //  Behaviour |  Method | Function | Data members
//        System.out.println("Father - 2BHK");
//    }

        void bhk3() {
            System.out.println("3BHK Son");
        }

    }

