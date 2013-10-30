/*
ID: Simon
PROB:transform
LANG: JAVA
*/

import java.util.*;
import java.io.*;

class transform {
	public static void main(String [] args)throws IOException {
		File input = new File("transform.in");
		int n;
		Scanner x = new Scanner(input);
		PrintWriter p = new PrintWriter("transform.out");
		n = x.nextInt();
		char a[][] = new char[n][n];
		char b[][] = new char[n][n];
		char c[][] = new char[n][n];
		char d[][] = new char[n][n];
		for(int i=0; i<n; i++){
			String s = x.next();
			for(int j=0; j<a[i].length; j++){
				a[i][j]= s.charAt(j);
			}
		}
		for(int i=0; i<n; i++){
			String s = x.next();
			for(int j=0; j<n; j++){
				b[i][j]= s.charAt(j);
			}
		}
		
		c = rotation(a,n);
		d = reflection(a,n);
		int ans;
		if(Arrays.deepEquals(b,c)) ans=1;
		else if(Arrays.deepEquals(b, rotation(c,n))) ans=2;
		else if(Arrays.deepEquals(b,rotation(rotation(c,n),n))) 
			ans=3;
		else if(Arrays.deepEquals(b,d)) ans=4;
		else if(Arrays.deepEquals(b,rotation(d,n))||
				Arrays.deepEquals(b,rotation(rotation(d,n),n))||
				Arrays.deepEquals(b,rotation(rotation(rotation(d,n),n),n))
				)
			ans=5;
		else if(Arrays.deepEquals(a, b)) ans=6;
		else ans=7;
		
		p.println(ans);
		p.close();
		
		
		
	}
	

	public static char[][] rotation(char x[][], int n){
		char y[][] = new char[n][n];
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++){
				y[i][j] = x[n-j-1][i];
			}
		
		return y;
	}
	
	public static char[][] reflection(char x[][], int n){
		char y[][] = new char[n][n];
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++){
				y[i][j] = x[i][n-j-1];
			}
		
		return y;
	}

	
}
