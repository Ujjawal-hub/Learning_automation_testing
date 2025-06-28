package string;

public class immutable {
    public static void main(String[] args) {
        String name = "Pramod"; // SCP
        name.toUpperCase();
        System.out.println(name);
        name = name.toUpperCase(); // PRAMOD
        System.out.println(name);
    }
}
