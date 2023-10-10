package bookcolectiontask;

import java.util.Arrays;

public class IntNumberArrayService {
    public static int findMin(int[] arrayTable) {
        int min = arrayTable[0];
        for (int i = 0; i < arrayTable.length; i++) {
            if (min > arrayTable[i]){
               min = arrayTable[i];
            }
        }
        return min;
    }

    public static int findMax (int[] arrayTable){
        int max = arrayTable[0];
        for (int i = 0 ; i<arrayTable.length; i++)
            if (max < arrayTable[i]){
                max = arrayTable[i];
            }return max;
    }


}
