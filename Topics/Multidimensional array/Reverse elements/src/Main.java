import java.util.Arrays;

class ArrayOperations {
    
    public static void reverseElements(int[][] twoDimArray) {

        for (int i = 0; i < twoDimArray.length; i++) {
            twoDimArray[i] = twoDimArray[twoDimArray.length - 1];
            for (int j = 0; j < twoDimArray[0].length; j++) {
                twoDimArray[j] = twoDimArray[twoDimArray.length - 1];
                System.out.print(Arrays.toString(twoDimArray[j]) + " ");
            }
            System.out.print(Arrays.toString(twoDimArray[i]) + " ");
        }

    }
}