/*
ID: Simon
PROB:barn1
LANG: JAVA
*/

import java.io.*;
import java.util.*;

class barn1 {
	public static void main(String [] args)throws IOException{
		File input = new File("barn1.in");
		Scanner s = new Scanner(input);
		PrintWriter p = new PrintWriter("barn1.out");
		int M = s.nextInt();
		int S = s.nextInt();
		int C = s.nextInt();
		int a[] = new int[C];
		for(int i=0; i<a.length; i++)
			a[i] = s.nextInt();
		Arrays.sort(a);
		//for(int i=0; i<a.length; i++)
		if(M==1)
			p.println(a[C-1]-a[0]+1);
		else if(M>C) 
			p.println(C);
		else p.println(stall(a,M,C));
		
		
		
		s.close();
		p.close();
	}
	
	public static int stall(int a[], int M, int C){
		int sum = 0;
		int count=1;
		int b[] = new int[C-1];
		for(int i=0; i<a.length-1; i++){
			b[i] = a[i+1]-a[i];
			//System.out.println(b[i]);
		}
		Arrays.sort(b);
		for(int i=(b.length-1); i>=0; i--){
			//System.out.println(b[i]);
			sum = sum + b[i];
			count++;
			if(count == M) break;
		}
		sum = a[C-1]-a[0]- sum + M;
		
		return sum;
	}
}
