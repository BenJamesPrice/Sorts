class BubbleSort {

    private int[] array;

    public void main (String[] args) {
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
        return null;
    }

    public int[] sortArray() {
        return null;
    }

}
