
import java.util.HashMap;
import java.util.Map;
public class CollectionPratise {

    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'a', 'b', 'a'};
  
        int[] charFreq= new int[256];

        for(char c:charArray)
        {
            charFreq[c]++;
        }

        for(int i=0;i<charFreq.length;i++)
        {
            if(charFreq[i]>0)
            System.out.println((char)i +" :->"+charFreq[i]);
        }




    }

}
