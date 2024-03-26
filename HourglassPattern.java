public class HourglassPattern {
	static void pattern(int rows_no) 
	{ 
		// first upper half
        for(int i=1;i<=rows_no;i++)
        {
            for(int space=1;space<i;space++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=rows_no;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");

        }

        // first upper half
        for(int i=rows_no-1;i>0;i--)
        {
            for(int space=1;space<i;space++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=rows_no;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    } 
	
	public static void main (String[] args) 
	{ 
		// taking rows value from the user 
		int rows_no = 7; 
	
		pattern(rows_no); 
	
	} 

}
