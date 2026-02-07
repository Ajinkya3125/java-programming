import java.util.*;

class StringExample {
    public static void main(String[] args) {
        String s = "Hello";
        s = s.concat(" World");
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf);

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        // intern() method
        String a = "Java";
        String b = new String("Java");
        String c = b.intern();// reference to the string s2
        System.out.println(a == c);

        // string methods-:Length & Character Methods
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('H'));
        System.out.println(s.lastIndexOf('o'));

        // Comparison method
        System.out.println(s.equals("Hello World"));// true
        System.out.println(s.equalsIgnoreCase("hello World"));// true
        System.out.println(s.compareTo("Hello World"));// 0
        System.out.println(s.compareTo("Apple"));// 7

        // Modification Methods
        System.out.println(s.replace("H", "K"));
        System.out.println(s.substring(0, 5));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());

        // Checking Methods
        System.out.println(s.contains("Hell"));
        System.out.println(s.startsWith("we"));
        System.out.println(s.endsWith("ld"));
        System.out.println(s.isEmpty());
        String str = " ";
        System.out.println(str.isBlank());

        // Conversion Methods
        char[] ch = s.toCharArray();
        for (char i : ch) {
            System.out.println(i);
        }

        String[] chars = s.split(" ");
        for (String j : chars) {
            System.out.println(j);
        }

        int n = 10;
        String str1 = String.valueOf(n);
        System.out.println(str1 + 20);

    }
}