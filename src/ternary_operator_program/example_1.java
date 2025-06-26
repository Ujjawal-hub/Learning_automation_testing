package ternary_operator_program;

import javax.management.MBeanAttributeInfo;

public class example_1 {
    //Uses ternary operator to compare a and b and print the maximum value.A =10, B= 20;
    public static void main(String[] args) {


        byte A = 10;
        byte B = 20;

        byte max = A > B ? A : B;

        System.out.println(max);
    }
}
