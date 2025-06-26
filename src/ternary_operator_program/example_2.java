package ternary_operator_program;

public class example_2 {
    public static void main(String[] args) {
        //: Uses ternary to check whether a number is even or odd. A = 19, update the a value and check again A =20;

        byte A = 20;
        String Return = A%2==0 ? "even": "odd";
        System.out.println(Return);
    }
}
