public class BubbleSort {
    public static void main(String[] arg) {
        int a[] = { 4, 5, 3, 1, 2 };
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println("\nafter sort:->");
        bubbleSort(a);
        for (int k = 0; k < a.length; k++) {
            System.out.println(" " + a[k]);
        }
    }

    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

}
