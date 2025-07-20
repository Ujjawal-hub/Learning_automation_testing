package _7julytask;

//. Bank Interest Calculation
//Description: Abstract class Bank with abstract method getInterestRate(). Classes SBI and HDFC implement it.
// Expected Output:
//SBI Interest Rate: 6.5%
//HDFC Interest Rate: 7.0%
public class bankinterstcalculation {

    public static void main(String[] args) {
        SBI s= new SBI();
        HDFC H = new HDFC();
        s.getintersetarte();
        H.getintersetarte();
    }
}


class SBI extends bank{

    @Override
    void getintersetarte() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends bank{


    @Override
    void getintersetarte() {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}


abstract class bank{


    abstract void getintersetarte();

}