

    import java.io.*;
import java.util.*;
    public class Monkey_Banana
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=0;i<t;i++)
            {
                int s=0;
                int n=sc.nextInt();
                int c=sc.nextInt();
                int[] arr =new int[n];
                for(int j=0;j<n;j++)
                {
                    arr[j]=sc.nextInt();
                    s=s+arr[j];

                }
                System.out.println();

                if(s<=c)
                {
                    System.out.println("Yes");

                }
                else{
                    System.out.println("No");
                }
            }

        }
    }

