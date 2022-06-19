public class InsertionSort {
    public static String[] insertionSort(String[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            String key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array[i].compareTo(key)>0 ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
        return array;
    }

    public static void main(String a[]){
        String[] arr1 = {"y","x","z","d","k","l","n","m"};
        System.out.println("Before Insertion Sort");
        for(String i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        String[] sortedArray=insertionSort(arr1);

        System.out.println("After Insertion Sort");
        for(String i:sortedArray){
            System.out.print(i+" ");
        }
    }
}
