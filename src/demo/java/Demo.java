package demo.java;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]=new int[5];
           //store the elements into array
		
           a[0]=10;
           a[1]=20;
           a[2]=30;
           a[3]=40;
           a[4]=50;
        	
           //read elements from an array
           
      /*  for(int i= 0; i<=4; i++){
        	System.out.println(a[i]);
        	
	}*/
           //for... each loop
           
           for(int i:a) {
        	   System.out.println(i);
           }
	}

}
