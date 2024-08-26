public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */

    public int[] combine(int[] arr1, int[] arr2){
//     ArrayList<Integer> combined = new ArrayList<Integer>();

        int final_size;
        final_size = arr1.length + arr2.length;
        int[] combined = new int[final_size];

        for (int i = 0; i < arr1.length; i++){
            combined[i] = arr1[i];
        }
        int j = 0;
      
        for (int i = arr1.length; i < (arr1.length + arr2.length); i++){
            combined[i] = arr2[j];
            j++;
        }

        return combined;
    }
}
