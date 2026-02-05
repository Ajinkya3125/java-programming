import java.util.Map;
import java.util.TreeMap;

class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(4, "Python");
        tm.put(2, "Java");
        tm.put(1, "C++");
        tm.put(3, "C#");

        System.out.println(tm);
        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
        System.out.println(tm.headMap(3));
        System.out.println(tm.tailMap(2));
        System.out.println(tm.subMap(1, 4));
        System.out.println(tm.descendingMap());

        for (Map.Entry<Integer, String> e : tm.entrySet()) {
            System.out.println(e.getKey() + "=" + e.getValue());
        }

    }
}