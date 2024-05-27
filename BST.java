public class BST {
    //create bst
    // insert delete tarverse
    // search

    public static void main(String[] args) {
        
        int a[]= {1,2,3,4,5,6};
        int item=5;
        int left=0;
        int right=a.length-1;
        boolean flag=false;
        int mid=-1;
        while(left<right)
        {
             mid= (left+right)/2;
            if(a[mid]>item)
            {
                right=mid+1;
            }
            else if(a[mid]<item)
            {
                left=mid+1;
            }
            else if(a[mid]== item){
                flag=true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("found it "+mid);
        }
        else{
            System.out.println("not found "+item);
        }
    }
}
