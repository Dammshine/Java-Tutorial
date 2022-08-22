public class intgerClass {
    public static void main(String[] argc) {
        Integer a = 0;

        // Static method, call it directly on class,
        // do not need to create a new instance of class
        a = Integer.max(a, -1);
        a = Integer.compare(a, -1);
        if (a == 0) {
            System.out.println("A is greater");
        }

        int b = Integer.parseInt("22");
        Integer c = Integer.valueOf("22222222");
        System.out.println(b + c);
    }
}
