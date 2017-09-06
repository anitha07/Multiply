# Multiply
import java.io.*;
import java.util.*;
class Multiplicationtable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int k=0;
        for(int i=1;i<=10;i++)
        {
            k=(a*i);
            System.out.println(a+"*"+i+"="+k);
        }
       // System.out.println(k);
    }
}
