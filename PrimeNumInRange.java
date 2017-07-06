import java.io.*;

public class PrimeNumInRange{
	public static void main(String[] args)throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		Integer firstNum,lastNum,i,j,flag;
		System.out.println("Enter the first number");
		firstNum = Integer.parseInt(bb.readLine());
		System.out.println("Enter the last number");
		lastNum = Integer.parseInt(bb.readLine());
		
		System.out.println("Prime numbers from "+firstNum+" and "+lastNum+" is ");
		
		for(i=firstNum;i<=lastNum;i++){
			flag = 0;
			for(j=2;j<=i/2;j++){
				if(i%j == 0){
					flag = 1;
					break;
				}
			}
		
		if(flag == 0)
			System.out.println(i);
		
		}	
		
	}
}
