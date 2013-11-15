/*
ID: Simon
PROB:milk2
LANG: JAVA
*/

import java.util.*; //use two int array start[] end [], sort start[] then find work and unwork time
import java.io.*;

class milk2 {
	public static void main(String [] args)throws IOException {
		File input= new File("milk2.in");
		Scanner s = new Scanner(input);
		PrintWriter p = new PrintWriter("milk2.out");
		int n = s.nextInt();
		int start[]= new int[n];
		int end[] = new int[n];
		int a, b, temp, temp2;
		for(int i=0; i<n; i++){
			a = s.nextInt();
			b = s.nextInt();
			start[i] = a;
			end[i] = b;
		}
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++){
				if(start[i]<start[j]){
					temp = start[i];
					temp2 = end[i];
					start[i] = start[j];
					end[i] = end[j];
					start[j] = temp;
					end[j] = temp2;
					
				}
			}
		
		int work=0, unwork=0;
		int x = start[0], y = end[0];
		work = end[0]-start[0];
		int max = work;
		int max2 =0;
		for(int k=1; k<n; k++){
			if(start[k]>y){
				unwork = start[k]-y;
				work = end[k]-start[k];
				y = end[k];
				x = start[k];
			} else if(end[k]>y){
				work = end[k]-x;
				y = end[k];
			}
			if(work>max) max=work;
			if(unwork>max2) max2=unwork;
		}

		s.close();
		p.println(max+" "+max2);
		p.close();
		
		
	}

}
