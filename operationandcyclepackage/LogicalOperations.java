package operationandcyclepackage;

public class LogicalOperations {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a && b;
        boolean d = a || b;
        System.out.println(c);
        System.out.println(d);

        boolean e = !(a && b ) && (a || b);
        System.out.println(e);
        boolean f = (a && b ) ||  (a || b);
        System.out.println(f);
    }
}
