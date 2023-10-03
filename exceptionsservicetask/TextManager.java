package exceptionsservicetask;

public class TextManager{
    public static int getTheTextLengh(String inputString){
        return inputString.length();
    }

    public static int getTheTextLenghWithException( String inputString){
        try {
            return inputString.length();
        } catch ( NullPointerException ignored){
            System.out.println("A fost depistata o exceptie " + ignored.getMessage());
            return 0;
        } finally {
            System.out.println("Blocul acesta va fi executat in orice caz");
        }
    }

    public static int returnValue(String inputString){
        if(inputString != null){
           return inputString.length();
        }
        return 0;
    }




}
