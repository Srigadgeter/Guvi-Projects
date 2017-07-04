import java.io.*;
import java.util.*;

public class LeastNum {

	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		Integer n,i,d,sub;
		String ns,str="";		
		ArrayList<Integer> ts = new ArrayList<Integer>();
		
		System.out.println("Enter the number : ");
		n = Integer.parseInt(bb.readLine());
		n = Math.abs(n);
		
		for(i=0;n>9;i++){
				sub = n%10;
				n /= 10;
				if(sub>0)
				ts.add(sub);
		}
		if(n>0)
			ts.add(n);
		Collections.sort(ts);
		
		for(Integer ii : ts)
			str += ii.toString();
		System.out.println(str);
		
		System.out.println("Enter the number of digits want to delete : ");
		d = Integer.parseInt(bb.readLine());
		
		System.out.println(str.substring(0,str.length()-d));
				
	}

}
