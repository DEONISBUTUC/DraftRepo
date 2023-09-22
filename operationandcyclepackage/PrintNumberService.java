package operationandcyclepackage;

public class PrintNumberService {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        for (int i = min; i <= max; i++) {
           if (i % 2 != 0) {System.out.println(i);
        }
    }

        int i = min;
        while (i < max){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        int b = max;
        do {
            System.out.println(b);
            b--;
        }while (b >= min);
}
}