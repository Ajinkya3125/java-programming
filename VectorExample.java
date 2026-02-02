import java.util.Vector;

class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println(v);

        // add element by default at the end
        v.addElement(40);
        System.out.println(v);

        // which element is present at a specific index
        System.out.println(v.elementAt(1));

        // firstElement() / lastElement()
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        // remove the particular element
        v.removeElement(20);
        System.out.println(v);

        // get the size and capacity of the vector
        System.out.println(v.size());
        System.out.println(v.capacity());// by default capacity is 10
    }
}