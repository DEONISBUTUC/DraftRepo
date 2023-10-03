package exceptionsservicetask;

public class Main {
    public static void main(String[] args) {
       // ArithmeticOperationService.divideInt(9,0);
ArithmeticOperationService.divideIntWithException(9,0);
//TextManager.getTheTextLengh(null);
        TextManager.getTheTextLenghWithException(null);
        System.out.println(TextManager.returnValue("sadas"));
        TextManager.getTheTextLenghWithException("sadas");
    }
}
