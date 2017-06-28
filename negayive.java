import java.io.*;
import java.util.*;
class negative
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int m=x.nextInt();
        float a[]=new float[m];
        for(int i=0;i<m;i++)
        {
            a[i]=x.nextFloat();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                float n=a[i]+a[j];
            if((n==0) || ((n<1) && (n>-1)))
            {
                System.out.print(a[i]+" "+a[j]+" ");
            }
            }
        }
    }
}
