class BubbleSort {

    private int[] array;

    public static void main (String[] args) {
        //Create unsorted array
        //Sort array
        //Print sorted array
        int[] unsorted = new int[]{5,3,9,2,6,1};
        BubbleSort bubble = new BubbleSort();
        bubble.setArray(unsorted);
        bubble.sortArray();
        int[] sorted = bubble.getArray();
        for (int i=0; i<sorted.length; i++) {
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
        for(int i=0; i<array.length-1; i++) {
            for(int j=0; j<array.length-1; j++){
                if(array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
