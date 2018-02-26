class QuickSort {

    private int[] array;

    public static void main(String[] args) {
        int[] unsorted = new int[]{7,5,2,9,4,6,3,1,8};
        QuickSort sort = new QuickSort();
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
        int[] uarray = this.getArray();
        quickSort(array, 0, uarray.length-1);
        this.setArray(uarray);
    }

    private void quickSort(int[] uarray, int first, int last) {
        if(first<last) {
            int pivot = partition(uarray, first, last);
            quickSort(uarray, first, pivot-1);
            quickSort(uarray, pivot+1, last);
        }
    }

    private int partition(int[] uarray, int first, int last) {
        int pivot = uarray[first];
        int low = first+1;
        int high = last;

        while(high>low){
            while(low<=high && uarray[low] <= pivot) {
                low++;
            }
            while(low<=high && uarray[high] > pivot) {
                high--;
            }
            if(high>low) {
                int temp = uarray[high];
                uarray[high] = uarray[low];
                uarray[low] = temp;
            }
        }

        while (high>first && uarray[high]>=pivot) {
            high--;
        }

        if(pivot>uarray[high]) {
            uarray[first] = uarray[high];
            uarray[high] = pivot;
            return high;
        } else {
            return first;
        }
    }
}
