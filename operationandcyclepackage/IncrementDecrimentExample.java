package operationandcyclepackage;

public class IncrementDecrimentExample {
    public static void main(String[] args) {
        int a = 74;
        int b = 34;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++b);

        b = b+1;
        System.out.println(b);
        System.out.println(--a + " " + --b);

        b = --a;
        System.out.println(a);
        System.out.println(b);
    }
}
