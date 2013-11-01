/*
ID: Simon
PROB:milk
LANG: JAVA
*/

import java.util.*;
import java.io.*;

class milk {
	public static void main(String [] args)throws IOException{
		File input = new File("milk.in");
		Scanner s = new Scanner(input);
		PrintWriter p = new PrintWriter("milk.out");
		int need = s.nextInt();
		int M = s.nextInt();
		int a[] = new int[M];
		int b[] = new int[M];
		int temp1, temp2;
		int cost = 0;
		for(int i=0; i<M; i++){
			a[i] = s.nextInt();
			b[i] = s.nextInt();
		}
		for(int i=0; i<M; i++)
			for(int j=0; j<M; j++){
				//System.out.println(a[i]+" "+a[j]);
				if(a[i]<a[j]){
					temp1 = a[i];
					temp2 = b[i];
					a[i] = a[j];
					b[i] = b[j];
					a[j] = temp1;
					b[j] = temp2;
				}
			}
		
		for(int i=0; i<M; i++){
			//System.out.println(a[i]+" "+b[i]);
			if(need > b[i]){
				cost =cost + a[i]*b[i];
				need = need - b[i];
			}else if(need <= b[i]){
				cost = cost + a[i]*need;
				need =0;
				break;
			}
		}
		p.println(cost);
		s.close();
		p.close();
	}
}
