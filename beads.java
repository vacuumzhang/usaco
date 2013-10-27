/*
ID: Simon
PROB:beads
LANG: JAVA
*/

import java.io.*;
import java.util.*;  // put two necklace together then find the answer easily

class beads {
	
	public static void main(String[] args) throws FileNotFoundException{
		InputStream in = new FileInputStream(new File("beads.in"));
		Scanner x = new Scanner(in);
		PrintWriter p = new PrintWriter("beads.out");
		int n = x.nextInt();
		String beads = x.next();
		byte[] b = beads.getBytes();
		char[] necklace = new char[2*n];
		for(int k=0; k<2*n; k++){
			if(k>n-1){
				necklace[k] = (char)b[k-n];
			}else {
				necklace[k] = (char)b[k];
			}
			
		}
		
		
		int sum=0;
		int max=0;
		int z,y;
		
		
		for(int i=0; i<n; i++){
			z = front(i,n,necklace);
			y = back(i,n,necklace);
			sum = z+y;
			if(max<sum){
				max = sum;
			}
		}
		x.close();
		if(max>n) max=n;
		p.println(max);
		p.close();
		
		
	}
	private static int front(int i, int n, char[] b) {
		char colour=0;
		int sum=0;
		int j = i;
		loop: 
			while(j<n){
				if(b[j] != 'w') {
					colour = b[j];
					break loop;
				}
				j++;
			}
		
		for(i=i;i<2*n;i++){
			if(b[i]== colour|b[i]=='w'){
				sum++;
			}else break;
		}
		return sum;
	}
	
	private static int back(int i, int n, char[] b) {
		char colour=0;
		int sum=0;
		int j = n+i-1;
		loop: 
			while(j>0){
				if(b[j] != 'w') {
					colour = b[j];
					break loop;
				}
				j--;
			}
		for(i=n+i-1;i>=0;i--){
			if(b[i]== colour|b[i]=='w'){
				sum++;
			}else break;
		}
		return sum;
	}



}
