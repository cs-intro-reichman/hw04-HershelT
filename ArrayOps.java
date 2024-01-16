import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(sort((new int[]{1, 2, 3}), false)));
//        System.out.println(isSorted(new int[]{3,2,1}));
//        System.out.println(findMissingInt(new int[]{3, 0, 1}));
//        System.out.println(findMissingInt(new int[] {7,6,9,4,3,1,2,5,0}));
//        System.out.println(containsTheSameElements(new int[] {1, 2, 1, 1, 2}, new int[] {2, 1}));
//        System.out.println(containsTheSameElements(new int[] {3, -4, 1, 2, 5}, new int[] {1, 3, -4, 5}));
//        System.out.println(containsTheSameElements(new int[] {1, 2, 3}, new int[] {1, 2, 3}));
//        System.out.println(secondMaxValue(new int[] {6, 9, 4, 7, 3, 4}));
    }
    //My own sorting algorithm using basic comparison operators to make ease of use for all problems
    public static int[] sort(int[] array, boolean increase){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (increase) {
                    int tempNum = 0;
                    if (array[j] < array[i]) {
                        tempNum = array[i];
                        array[i] = array[j];
                        array[j] = tempNum;
                    }
                }
                else {
                    int tempNum = 0;
                    if (array[j] > array[i]) {
                        tempNum = array[i];
                        array[i] = array[j];
                        array[j] = tempNum;
                    }
                }

            }
        }
        return array;
    }

    public static int findMissingInt (int[] array) {
        int[] sortedArray = sort(array, true);
        for (int i = 0; i < sortedArray.length; i++) {
            if (i != sortedArray[i]) {
                return i;
            }
        }
        return 1;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int[] sortedArray = sort(array, true);
        return sortedArray[array.length-2];
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        boolean[] cases = new boolean[array1.length];
        for (int i = 0; i < array1.length;i++){
            for (int j = 0; j <array2.length;j++){
                if (array1[i] == array2[j]){
                    cases[i] = true;
                }
            }
            if (!cases[i]) {
                return false;
            }

        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        int[] clonedArray = new int[array.length];
        for (int i =0; i<array.length;i++) {
            clonedArray[i] = array[i];
        }
        int[] checkSortedArray;
        if (array[1] > array[0]) {
            checkSortedArray = sort(clonedArray, true);
        }
        else {
            checkSortedArray = sort(clonedArray, false);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != checkSortedArray[i]){
                return false;
            }
        }
        return true;
    }

}
