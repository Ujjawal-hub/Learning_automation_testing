package ternary_operator_program;

public class example_3 {
    public static void main(String[] args) {
       // Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.

        byte X = 85;

        String marks = X<40 ? "Fail":(X>=90?"A+":(X>=75?"A":(X>=60?"B":"C")) );
        System.out.println(marks);


    }
}
