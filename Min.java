import java.io.*;
import java.util.*;

public class Min {

	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		Integer n,i,d,sub;
		String ns,str="";		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		System.out.println("Enter the number : ");
		n = Integer.parseInt(bb.readLine());
		
		for(i=0;n>9;i++){
				sub = n%10;
				n /= 10;
				if(sub>0)
				ts.add(sub);
		}
		if(n>0)
			ts.add(n);
		
		for(Integer ii : ts)
			str += ii.toString();
		//System.out.println(str);
		
		System.out.println("Enter the number of digits want to delete : ");
		d = Integer.parseInt(bb.readLine());
		
		System.out.println(str.substring(0,str.length()-d));
				
	}

}
