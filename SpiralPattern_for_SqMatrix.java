import java.io.*;

public class SpiralPattern_for_SqMatrix {

	public static void main(String[] args)throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		int i,j,mm,nnn,mmm,x,y,xx,yy;
		System.out.println("Enter the value of n :");
		Integer n = Integer.parseInt(bb.readLine());
		nnn = n;
		mmm = n;
		// 2D array declaration
		Integer[][] a = new Integer[n][];
		for(i=0;i<n;i++)
			a[i] = new Integer[n];
		
		i = 0;
		mm = 1;
		x = 0;
		y = 0;
		yy = n;
		xx = n;
		
		while(mm <= n*n){
			i=x;
			//System.out.println("x="+x+",y="+y);
			for(j=y;j<n;j++){
				if(a[i][j] == null){
					a[i][j] = mm;
					//System.out.println("a["+i+"]["+j+"]="+a[i][j]);
					mm++;
				}
			}
			
			x++;
			xx--;
			//System.out.println("x="+x+",xx="+xx);
			for(i=x;i<n;i++){
				if(a[i][xx] == null){
					a[i][xx] = mm;
					//System.out.println("a["+i+"]["+xx+"]="+a[i][xx]);
					mm++;
				}				
			}
			
			yy--;
			//System.out.println("yy="+yy+",xx="+xx);
			for(j=xx-1;j>=0;j--){
				if(a[yy][j] == null){
					a[yy][j] = mm;
					//System.out.println("a["+yy+"]["+j+"]="+a[yy][j]);
					mm++;
				}
			}
			
			j=y;
			//System.out.println("j="+j+",yy="+yy+",y="+y);
			for(i=yy-1;i>=0;i--){
				if(a[i][j] == null){
					a[i][j] = mm;
					//System.out.println("a["+i+"]["+j+"]="+a[i][j]);
					mm++;
				}
			}
			y++;
		}
		
		System.out.println("\nSpiral form of matrix "+n+"x"+n+" is :");
		for(i=0;i<nnn;i++){
			for(j=0;j<mmm;j++){
			System.out.format("%-5s",String.valueOf(a[i][j]));
			}
			System.out.println();
		}
		
	}
}

