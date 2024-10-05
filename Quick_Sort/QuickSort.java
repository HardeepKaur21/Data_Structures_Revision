public class QuickSort {
    int partition(int a[], int start, int end) {

        int pivot = a[end];
        int pindex = start;

        for (int i = start; i < end - 1; i++) {
            if (a[i] <= pivot) {
                int t = a[pindex];
                a[pindex] = a[i];
                a[i] = t;
                pindex++;
            }
        }

        int t = a[pindex];
        a[pindex] = a[end];
        a[end] = t;
        return pindex;

    }

    public void quick(int a[], int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);
            quick(a, start, p - 1);
            quick(a, p + 1, end);
        }
    }
}
