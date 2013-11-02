/*
ID: Simon
PROB:crypt1
LANG: JAVA
*/

import java.io.*;
import java.util.*;

public class crypt1 {
	public static void main(String []args)throws IOException{   
		File input = new File("crypt1.in");						
		Scanner s = new Scanner(input);
		PrintWriter p = new PrintWriter("crypt1.out");													
		int num = s.nextInt();									
		int list[] = new int[num];								
		for(int i=0; i<list.length; i++)						
			list[i] = s.nextInt();
		int count=0;                                                    	
		int a[] = new int[(int)Math.pow(num, 2)];
		for(int i=0; i<list.length; i++)
			for(int j=0; j<list.length; j++){
				a[count] = list[i]*10+list[j];
				count++;
				//System.out.println(a[i]);
			}
				
		int b[] = new int[(int)Math.pow(num, 3)];
		count=0;
		for(int i=0; i<list.length; i++)
			for(int j=0; j<list.length; j++)
				for(int k=0; k<list.length; k++){
					b[count] = list[i]*100+list[j]*10+list[k];
					count++;
					//System.out.println(b[i]);
				}
				
		int c[] = new int[(int)Math.pow(num, 4)];
		count=0;
		for(int i=0; i<list.length; i++)
			for(int j=0; j<list.length; j++)
				for(int k=0; k<list.length; k++)
					for(int h=0; h<list.length; h++){
						c[count] = list[i]*1000+list[j]*100+list[k]*10+list[h];
						count++;
					}
		//for(int i=0; i<a.length;i++) System.out.println(a[i]);
		//for(int i=0; i<b.length;i++) System.out.println(b[i]);
		//for(int i=0; i<c.length;i++) System.out.println(c[i]);
		
		int output= test1(a,b,c,list);
		p.println(output);
		p.close();
		s.close();
		
	}
	
	public static int test1(int a[],int b[],int c[], int list[]){
		int count = 0;
		//int n=0;
		int temp,temp1,temp2;
		//int X[] = new int[b.length];
		for(int i=0; i<b.length; i++)     //  222*2
			for(int j=0; j<list.length; j++){
				temp = b[i]*list[j];
				if(check(b,temp)==1) {     //  222*2
						for(int l=0; l<list.length; l++){
							temp1 = b[i]*list[l];
							if(check(b,temp1)==1){
								temp2 = temp+ (temp1*10);
								if(check(c,temp2)==1) {
									count++; 
									System.out.println(" "+b[i]+"*"+list[j]+"="+temp);
									System.out.println(b[i]+"*"+list[l]+"="+temp1);
									System.out.println("------"+temp2);
								}
							}
						}
				}
			}
		System.out.println(count);
		return count;
	}
	
	public static int check(int x[], int n){
		int t = -1;
		//System.out.println(X.length);
		for(int i=0; i<x.length; i++){
			//System.out.println(i+" "+x[i]+" "+n);
			if(x[i]==n) {
				//System.out.println("-----"+n+" "+x[i]);
				t=1;
				break;
			}
		}
		return t;
	}
	
}
