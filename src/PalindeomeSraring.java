import java.util.Scanner;
public class PalindeomeSraring {

	public static void main(String[] args) {
		
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter your string");
    
    String str=sc.nextLine();
    sc.close();
    String org_str=str;
    
    String rev ="";
    int len=str.length();
    
    for(int i=len-1;i>=0;i--) {
    	rev=rev+str.charAt(i);
    }
    
    if(org_str.equals(rev))
    {
    	System.out.println(org_str+" is a palindeome String");
    }
    else {
    	System.out.println(org_str+" is not a palindeome String");
    }
	}

}
