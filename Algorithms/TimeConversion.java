import java.io.*;
import java.util.*;

public class TimeConversion {

    public static void main(String[] args) {
         Scanner sn= new Scanner(System.in);
        String data=sn.nextLine();
        String hh="", mm="", ss="",ampm="";

        for(int i=0;i<data.length();i++) {
             hh =data.substring(0,2) ;
             mm =data.substring(3,5) ;
             ss =data.substring(6,8) ;
             ampm =data.substring(8,10) ;
        }

        StringBuffer sb= new StringBuffer();
        if(ampm.equals("AM"))
        {
            if(hh.equals("12")) {
                sb.append("00:");
            } else {
                sb.append(hh+":");
            }

            sb.append(mm+":");
            sb.append(ss);
        }
        else if(ampm.equals("PM"))
        {

            if(hh.equals("12")) {
                sb.append(hh+":");
            } else {

                int convert=Integer.valueOf(hh)+12;

                sb.append(convert+":");
            }

            sb.append(mm+":");
            sb.append(ss);
        }

        System.out.println(sb.toString());



    }
}