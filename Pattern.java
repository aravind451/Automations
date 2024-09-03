package com.frame;

public class Pattern {
public static void main(String[] args) {
	int n=5;
	String s="mamam";
String s2="";
	for(int a=s.length()-1;a>=0;a--) {
	s2=s2 .concat(String.valueOf(s.charAt(a)))	;
	}if(s2.equalsIgnoreCase(s) ){System.out.println("palindrome");
	}
	System.out.println(s2);
	for(int i=1;i<=n;i++)
	{
		
		for(int j=0;j<n-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++) {
			if(k==1||k==(2*i-1)||i==n) {
			System.out.print("*");
		}
			else{
				System.out.print(" ");
			}}
		System.out.println();
	}
}
}
