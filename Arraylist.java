
//ArrayList
import java.util.*;

class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(2, 25);
        list.set(0, 5);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        for (Integer l : list) {
            System.out.println(l);
        }
    }
}