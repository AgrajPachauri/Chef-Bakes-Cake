import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter number of cakes:-");
        int N=sc.nextInt();
        //System.out.println("Enter weight of cakes:-");
        int X=sc.nextInt();
        //System.out.println("Enter capacity of trucks:-");
        int Y=sc.nextInt();
        int Z,answer;
        if(Y>=X)
        {
            Z=Y/X;
        
            if(N%Z==0)
            {
                answer=(N/Z);
            }
            else
            {
                answer=(N/Z)+1;    
            }
            System.out.print(answer);
        }
  	}
}
