import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        String text=sn.nextLine();
        
        int count=1;

        for(int i=0;i<text.length();i++)
        {
            int val= text.charAt(i);

            if(val>=65 && val<=90)
            {
                count=count+1;
            }


        }
        System.out.println(count);

    }
}
