import java.util.LinkedHashMap;
import java.util.Map;

class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(1, "Python");
        lhm.put(2, "Java");
        lhm.put(3, "C++");
        lhm.put(null, "C#");

        System.out.println(lhm.get(3));

        for (Map.Entry<Integer, String> e : lhm.entrySet()) {
            System.out.println(e.getKey() + "=" + e.getValue());
        }
    }
}