package exceptionsservicetask;

public class ArithmeticOperationService {
    public static int divideInt( int a, int b){

        return a/b;
    }
    public static int divideIntWithException (int a , int b){

        try {
            int result = a/b;
        } catch (ArithmeticException exceptionObject){
            System.out.println("A fost depistata o exceptie " + exceptionObject.getLocalizedMessage());
        }
        return 0;
    }
}
