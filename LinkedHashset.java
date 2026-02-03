
//Hashset
import java.util.LinkedHashSet;

class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        System.out.println(lhs);// It maintains the insertion order

        // remove the element
        lhs.remove(20);
        System.out.println(lhs);

        // element contains in the set or not
        System.out.println(lhs.contains(40));

        // add the null element
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);

        // accessing all elements usin foreach loop
        for (Integer s : lhs) {
            System.out.println(s);
        }
    }
}