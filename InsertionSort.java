class InsertionSort {

    private int[] array;

    public static void main(String[] args) {
        int[] unsorted = new int[]{7,4,2,9,10,3,6};
        InsertionSort sort = new InsertionSort();
        sort.setArray(unsorted);
        sort.sortArray();
        int[] sorted = sort.getArray();
        for(int i=0; i<sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }

    public void setArray(int[] a) {
        array = a.clone();
    }

    public int[] getArray() {
        return array;
    }

    public void sortArray() {
        int current;
        int j;
        for(int i=1; i<array.length; i++) {
            current = array[i];
            j = i-1;
            while(j>=0 && current<array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
}
