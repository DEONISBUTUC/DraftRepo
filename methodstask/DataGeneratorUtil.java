package methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {
    private static Random random = new Random();
    public static int getRandomInt(int min, int max){
        if (min >= max){
            System.out.println("Valoare minima trebuie sa fie mai mica ca cea maxima");
            return 0;
        }
       int delta = max - min;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber = deltaRandomInt + min;
        return randomNumber;
    }
    public static int getRandomDouble ( int limit){
        return random.nextInt(limit);
    }
    public static double getRandomInt(double limit){
        if (limit <= 0 ){
            System.out.println("Limita trebuie sa fie pozitiva");
            return 0;
        }
        return random.nextDouble() + limit;
    }

    static String getRandomEmail (String domainName){
        String unicUUID = UUID.randomUUID().toString();
        return unicUUID + "@" + domainName;
    }
    public static String generateValidRandomEmilString(int lenght){
        String caractereAcceptare = "E2E";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < lenght ; i++){
            int randomIndex = DataGeneratorUtil.getRandomDouble(caractereAcceptare.length());
            builder.append(caractereAcceptare.charAt(randomIndex));
            System.out.println(" In iteratia: i = " + i + caractereAcceptare.charAt(randomIndex));
        }
        return builder.toString() + "@gmail.com";
    }

}
