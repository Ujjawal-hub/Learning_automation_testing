package LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class llp3 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            if (fruit.equals("Banana")) {
                iterator.remove(); // Safely remove 'Banana'
            }
        }

        System.out.println("After removal: " + fruits);
    }
}
