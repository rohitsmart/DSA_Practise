public class MergeSort {

    public void sort(int arr[], int l, int r) {

        if(l<r)
        {
            int middle= (l+r)/2;
            sort(arr, l, middle);
            sort(arr, middle+1, r);
            merge(arr,l,middle,r);
        }
    }

    public void merge(int arr[],int l,int m,int r) {

        int n1=m-l+1;
        int n2=r-m;
        int left[]= new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            left[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++)
        {
            right[j]=arr[m+1+j];
        }
        int i=0;
        int j=0;
        int k=l;
        while (i<n1 && j<n2) {
            if(left[i] <= right[j])
            {
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        
        while(i<n1)
        {
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
    
    public static void main(String[] args) {

        int a[]={5,1,4,6,2,3};
        System.out.println("Before Sorted-->");

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Array:-> "+a[i]);
        }
        MergeSort mergeSort= new MergeSort();
        mergeSort.sort(a, 0, a.length-1);
        System.out.println("After Sorted-->");

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Array:-> "+a[i]);
        }

    }
}
