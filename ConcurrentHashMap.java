import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Ajinkya");
        map.put(2, "Gaurav");

        System.out.println(map.get(1));
    }
}