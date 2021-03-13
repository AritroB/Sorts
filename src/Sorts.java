public class Sorts {
    public void BubbleSort(int[] a) {
        for (int pass = a.length - 1; pass >= 0; pass--) {
            for (int i = 0; i <= pass - 1; i++) {
                if (a[i] > a[i+1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
    }

    public void BubbleSortImproved(int[] a) {
        boolean swapped = true;
        for (int pass = a.length - 1; pass >= 0 && swapped; pass--) {
            swapped = false;
            for ( int i = 0; i <= pass - 1; i++) {
                if (a[i] > a[i+1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public void Selection(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    public void InsertionSort(int[] a) {
        for (int i = 1; i <= a.length - 1; i++) {
            int v = a[i];
            int j = i;
            while (a[j-1] > v && j >= i) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = v;
        }
    }

    public void Merge(int[] a, int[] temp, int left, int mid, int right) {
        int i, left_end, size, temp_pos;
        left_end = mid - 1;
        temp_pos = left;
        size = right - left + 1;
        while ((left <= left_end) && (mid <= right)) {
            if (a[left] <= a[mid]) {
                temp[temp_pos] = a[left];
                temp_pos = temp_pos + 1;
                left = left + 1;
            } else {
                temp[temp_pos] = a[mid];
                temp_pos = temp_pos + 1;
                mid = mid + 1;
            }
        }
        while (left <= left_end) {
            temp[temp_pos] = a[left];
            left++;
            temp_pos++;
        }
        while (mid <= right) {
            temp[temp_pos] = a[mid];
            mid++;
            temp_pos++;
        }
        for (i = 0; i <= size; i++) {
            a[right] = temp[right];
            right++;
        }
    }

    public void quickSort(int[] a, int low, int high) {
        int left, right, pivot_item = a[low];
        left = low;
        right = high;
        while (left < right) {
            while (a[left] <= pivot_item) {
                left++;
            }
            while(a[right] > pivot_item) {
                right--;
            }
            if (left < right) {
                swap(a,left,right);
            }
        }
        a[low] = a[right];
        a[right] = pivot_item;
    }

    private void swap(int[] a, int left, int right) {
        int temp = 0;
        temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
}
