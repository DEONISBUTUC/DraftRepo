package operationandcyclepackage;

public class AssignmentOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;

        a = a + 1;
        b = b + 1;
        System.out.println(a +" " + b);

        int c = b % a;
        System.out.println(c);

        a %= b;
        System.out.println(a);

        int x = 15;
        int sum =0;
        for (int i = 0; i <= x; i++){
            sum += i;
        }
        System.out.println(sum);


    }
}
