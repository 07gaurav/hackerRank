import java.util.Scanner;

public class GradingStudents {

    public static void main(String args[]){

        Scanner sn= new Scanner(System.in);
        int size=sn.nextInt();
        int data[]=new int[size];
        for(int i=0;i<size;i++){
            data[i]=sn.nextInt();
        }

        for(int j=0;j<size;j++){
            if(data[j]>=38){
                if(data[j]%5==0){
                    System.out.println(data[j]);
                }else {
                    int temp= data[j]%5;
                    if(5-temp<3){
                        System.out.println(data[j]+(5-temp));
                    }else{
                        System.out.println(data[j]);
                    }
                }
            }else{
                System.out.println(data[j]);
            }
        }

    }
}
