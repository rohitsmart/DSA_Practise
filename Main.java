import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 1, 1, 2, 3, 3, 3, 4, 4, 4, 1, 2, 1};
        int[] iterate= new int[a.length];
        iterate[0]=a[0];
        int l=1;

        for(int i :iterate)
        {
            int count=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[j]==i)
                {
                    count++;
                }
                else{
                    boolean exist= numberExistInIterator(a[j],iterate);
                    if(!exist)
                    {
                        iterate[l++]=a[j];
                    }
                }
            }
            System.out.println("number "+i+" count "+count);



        }
        
        
    }

    private static boolean numberExistInIterator(int i, int[] iterate) {

        for(int j=0;j<iterate.length;j++)
        {
            if(iterate[j]==i)
            {
                return true;
            }
        }
        return false;
    }
}
