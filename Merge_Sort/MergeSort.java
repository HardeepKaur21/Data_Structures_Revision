public class MergeSort {

    void merge(int a[], int start, int mid, int end) {
        int l = mid - start + 1;
        int r = end - mid;
        int left_subarray[] = new int[l];
        int right_subarray[] = new int[r];

        for (int i = 0; i < l; ++i) {
            left_subarray[i] = a[start + i];
        }

        for (int j = 0; j < r; ++j) {
            right_subarray[j] = a[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = start;

        while (i < l && j < r) {
            if (left_subarray[i] <= right_subarray[j]) {
                a[k] = left_subarray[i];
                i++;
            } else {
                a[k] = right_subarray[j];
                j++;
            }
            k++;
        }

        while (i < l) {
            a[k] = left_subarray[i];
            i++;
            k++;
        }

        while (j < r) {
            a[k] = right_subarray[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int a[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

}