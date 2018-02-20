import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        String mystr =sn.next();
        int size=mystr.length();
        int totalnum=size/3;

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<totalnum;i++){
            sb.append("SOS");
        }

        String expectedstr=sb.toString();

        int count=0;
        for(int j=0; j<expectedstr.length();j++){
            char tmpex=expectedstr.charAt(j);
            char tmpmystr=mystr.charAt(j);

            if(tmpex!=tmpmystr)
                count++;
        }
        System.out.println(count);

    }
}