import java.util.Arrays;

public class ArrayRotation {

    public static int[] rotateArray(int[] arr, int rotationCount) {
        if (arr == null || arr.length == 0 || rotationCount == 0) {
            return arr;
        }

        rotationCount = rotationCount % arr.length; 
        // Adjust rotation count if it's larger than array length

        int[] rotatedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int rotatedIndex = (i + rotationCount) % arr.length;
            rotatedArray[rotatedIndex] = arr[i];
        }

        return rotatedArray;
    }

    public static void main(String[] args) {
        int inputArray[] = {1, 2, 3, 4, 5};
        int rotationCount = 2;
        int outputArray[] = rotateArray(inputArray, rotationCount);
        System.out.println(Arrays.toString(outputArray));
    }
}