public class QuickSort {

    public static void main(String[] args) {
        int a[] = {4, 1, 5, 2, 3};

        sort(a, 0, a.length - 1);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    private static void sort(int[] a, int l, int r) {
        if (l < r) {
            int pivotIndex = partition(a, l, r);
            sort(a, l, pivotIndex - 1);
            sort(a, pivotIndex + 1, r);
        }
    }

    private static int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1; 
    }
}
