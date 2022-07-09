import java.util.*;

public class odd_even_linked_list {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int a[]=new int[l];
        for(int i=0;i<l;i++)
            a[i]=sc.nextInt();
        List<Integer> l1=new ArrayList<Integer>();
        List<Integer> l2=new ArrayList<Integer>();
        List<Integer> merge=new ArrayList<Integer>();

        for(int i=0;i<l;i++)
        {
            if((i+1)%2!=0)
                l1.add(a[i]);
            else
                l2.add(a[i]);
        }
        merge.addAll(l1);
        merge.addAll(l2);
        for(int i=0;i<l;i++)
            System.out.print(merge.get(i)+" ");

    }
}