import java.util.ArrayList;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */

 //   ArrayList<Integer> combined = new ArrayList<Integer>();
    ArrayList<Integer> combined = new ArrayList<Integer>();
    public int[] combine(int[] arr1, int[] arr2){

        for (int i = 0; i < arr1.length; i++){
            combined.add(arr1[i]);
        }
      
        for (int i = 0; i < arr2.length; i++){
            combined.add(arr2[i]);
        }

        return combined;
    }
}
