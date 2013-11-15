/*
ID: Simon
PROB:dualpal
LANG: JAVA
*/

import java.util.*;
import java.io.*;

class dualpal {
	public static void main(String [] args)throws IOException{
		File input = new File("dualpal.in");
		Scanner s = new Scanner(input);
		PrintWriter p = new PrintWriter("dualpal.out");
		int N = s.nextInt();
		int S = s.nextInt();
		int count1 = 0;
		for(int i = S+1; 1>0; i++){
			int count2 = 0;
			for( int j=2; j<=10; j++){
				if(change(i,j).equals(palindrome(i,j))){
					//System.out.println(i+" "+ j +" "+change(i,j));
					count2++;
				}
				//System.out.println(count2);
			}
			if(count2>=2) {
				p.println(i);
				System.out.println(i);
				count1++;
			}
			if(count1==N) break;
		}
		s.close();
		p.close();
	}
	
	public static String change(int num, int n){
		String s = "";
		int ret;
		String ret2 = "";
		while(num!=0){
			ret = num%n;
			num = num/n;
			if(ret<10) ret2=""+ret;
			s = ret2+s;
		}
		
		return s;
	}
	
	public static String palindrome(int num, int n){
		String s = "";
		int ret;
		String ret2 = "";
		while(num!=0){
			ret = num%n;
			num = num/n;
			if(ret<10) ret2=""+ret;
			s = s+ret2;
		}
		
		return s;
		
	}
	

}
