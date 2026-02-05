import java.util.*;

class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1, "Python");
        mp.put(2, "Java");
        mp.put(3, "C++");
        mp.put(4, "C#");

        System.out.println(mp.get(3));

        for (Map.Entry<Integer, String> e : mp.entrySet()) {
            System.out.println(e.getKey() + "=" + e.getValue());
        }
    }
}