package sample;

import java.util.Scanner;

public class SetNum1 {
	public static void main(String[] args) {
		
	
	Scanner ob = new Scanner(System.in);
	int t=ob.nextInt();
	for(int j=1;j<=t;j++)
	{
		int x1,p1,x2,p2;
		x1=ob.nextInt();
		p1=ob.nextInt();
		x2=ob.nextInt();
		p2=ob.nextInt();
		String s1="";
		for(int i=1;i<=p2;i++)
			s1=s1+"0";
		s1=x1+s1;
		String s2="";
		for(int i=1;i<=p2;i++)
			s2=s2+"0";
		s2=x2+s2;
		int a=Integer.valueOf(s1);
		int b=Integer.valueOf(s2);
		if(a>b)
			System.out.println(">");
		else if(a==b)
			System.out.println("=");
		else
			System.out.println("<");
	}
	}
}
