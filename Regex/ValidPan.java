class ValidPan{
	public static void main(String args[]){
        Scanner sn= new Scanner(System.in);
        int size= sn.nextInt();

        String data[]=new String[size];
        for(int i=0;i<size;i++){
            data[i]=sn.next();
        }

        for(int j=0;j<data.length;j++){
            String tmp=data[j];
            if( (tmp.charAt(0)>=65 && tmp.charAt(0)<=90 ) &&
                    (tmp.charAt(1)>=65 && tmp.charAt(1)<=90 ) &&
                    (tmp.charAt(2)>=65 && tmp.charAt(2)<=90 ) &&
                    (tmp.charAt(3)>=65 && tmp.charAt(3)<=90 ) &&
                    (tmp.charAt(4)>=65 && tmp.charAt(4)<=90 ) &&
                    (tmp.charAt(5)>=48 && (int)tmp.charAt(5)<=57 ) &&
                    (tmp.charAt(6)>=48 && (int)tmp.charAt(6)<=57 ) &&
                    (tmp.charAt(7)>=48 && (int)tmp.charAt(7)<=57 ) &&
                    (tmp.charAt(8)>=48 && (int)tmp.charAt(8)<=57 ) &&
                    (tmp.charAt(9)>=65 && tmp.charAt(9)<=90 )
                    ){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
	
}