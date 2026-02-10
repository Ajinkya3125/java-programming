public class WrapperExample {
    public static void main(String[] args) {
        // Integer class
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);// Integer cache range: -128 to 127

        // Double class
        Double d = 10.5;
        System.out.println(Double.parseDouble("10.5"));
        System.out.println(Double.valueOf("10.5"));

        // Character Class
        Character c = 'A';
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

        // parseInt()
        String s = "100";
        int x = Integer.parseInt(s);
        System.out.println(x);// 100
        System.out.println(x + 20);// 120

        // valueOf()
        String str = "100";
        Integer y = Integer.valueOf(str);
        System.out.println(y);// 100
        System.out.println(y + 20);// 120
    }
}