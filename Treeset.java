
//Hashset
import java.util.TreeSet;

class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(20);
        ts.add(10);
        ts.add(40);
        ts.add(30);
        System.out.println(ts);// It maintains the insertion order

        // remove the element
        ts.remove(20);
        System.out.println(ts);

        // element contains in the set or not
        System.out.println(ts.contains(40));

        // add the null element
        // ts.add(null);
        // System.out.println(ts);

        // accessing all elements usin foreach loop
        for (Integer s : ts) {
            System.out.println(s);
        }

        // TreeSet Special Methods
        System.out.println(ts.first());// first()
        System.out.println(ts.last());// last()

        System.out.println(ts.higher(10));// higher
        System.out.println(ts.lower(20));// lower

        System.out.println(ts.ceiling(15));
        System.out.println(ts.floor(15));

        System.out.println(ts.pollFirst());// removes smallest
        System.out.println(ts.pollLast());// removes largest

        System.out.println(ts.subSet(10, 30));
        System.out.println(ts.headSet(20));
        System.out.println(ts.tailSet(20));
    }
}