/*
ID: Simon
PROB:palsquare
LANG: JAVA
*/

import java.util.*;
import java.io.*;

class palsquare {
	public static void main(String [] args)throws IOException{
		File input = new File("palsquare.in");
		PrintWriter p = new PrintWriter("palsquare.out");
		Scanner x = new Scanner(input);
		int N = x.nextInt();
		int square;
		for(int i=1; i<301; i++){
			square = i*i;
			if(change(square,N).equals(palindrome(square,N))){
				p.println(change(i,N)+" "+change(square,N));
				//System.out.print(i+" ");
				//System.out.println(change(square,N));
			}
		}
		x.close();
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
			if(ret ==10) ret2="A";
			if(ret ==11) ret2="B";
			if(ret ==12) ret2="C";
			if(ret ==13) ret2="D";
			if(ret ==14) ret2="E";
			if(ret ==15) ret2="F";
			if(ret ==16) ret2="G";
			if(ret ==17) ret2="H";
			if(ret ==18) ret2="I";
			if(ret ==19) ret2="J";
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
			if(ret ==10) ret2="A";
			if(ret ==11) ret2="B";
			if(ret ==12) ret2="C";
			if(ret ==13) ret2="D";
			if(ret ==14) ret2="E";
			if(ret ==15) ret2="F";
			if(ret ==16) ret2="G";
			if(ret ==17) ret2="H";
			if(ret ==18) ret2="I";
			if(ret ==19) ret2="J";
			s = s+ret2;
		}
		
		return s;
		
	}
	

}
