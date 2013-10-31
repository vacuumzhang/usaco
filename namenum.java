/*
ID: Simon
PROB:namenum
LANG: JAVA
*/

import java.util.*;
import java.io.*;



class namenum {
	public static void main(String [] args)throws IOException{
	BufferedReader input = new BufferedReader(new FileReader("namenum.in"));
	BufferedReader dict = new BufferedReader(new FileReader("dict.txt"));
	PrintWriter p = new PrintWriter("namenum.out");

	String s = input.readLine();
	String name, fit;
	
	
	
	int x[]= new int[s.length()];
	byte[] b = s.getBytes();
	
	for(int i=0; i<s.length(); i++){
		x[i] = (int)b[i]-48;
	}

	int k=0;
	do{
		name = dict.readLine();
		if(name == null){
			if(k==0) p.println("NONE");								//if no one match print "none"
			break;
		}
		if(name.length()==s.length()&&x[0]==firstnumber(name,0)){  // check name from dict.txt
			fit = name;												// same length and first number
			if(Arrays.equals(x,test(fit))){							// then check every number
				p.println(fit);											
				System.out.println(fit);
				k++;
			}
		}
	}while(name !=null);
	
	
	
	p.close();
	input.close();
	dict.close();
	}
	
	public static int firstnumber(String x, int i){
		int n =0;
		char c = x.charAt(i);
		if(c=='A'||c=='B'||c=='C') n=2;
		if(c=='D'||c=='E'||c=='F') n=3;
		if(c=='G'||c=='H'||c=='I') n=4;
		if(c=='J'||c=='K'||c=='L') n=5;
		if(c=='M'||c=='N'||c=='O') n=6;
		if(c=='P'||c=='R'||c=='S') n=7;
		if(c=='T'||c=='U'||c=='V') n=8;
		if(c=='W'||c=='X'||c=='Y') n=9;
		return n;
	}
	
	public static int[] test(String x){
		int name[]= new int[x.length()];
		for(int i=0; i<x.length();i++){
			name[i] = firstnumber(x,i);
		}
		return name;
	}
	
	

}
