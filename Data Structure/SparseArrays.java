import java.io.*;
import java.util.*;

public class SparseArrays {

    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        int slength=sn.nextInt();
        String sarr[]=new String[slength];
        for(int i=0;i<slength;i++)
        {
            sarr[i]=sn.next();
        }
        int queries=sn.nextInt();
        String qarr[]=new String[queries];
        for(int j=0;j<queries; j++)
        {
            qarr[j]=sn.next();
        }

        for(int k=0;k<qarr.length;k++)
        {
            int count=0;
            String tmp=qarr[k];

            for(int x=0;x<sarr.length;x++)
            {
                if(sarr[x].equals(tmp))
                count++;
            }

            System.out.println(count);
        }
    }
}
