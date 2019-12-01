package com.csi.star;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("trangle");
for(int i=1;i<=4;i++)
{
	for(int j=4;j>=1;j--) 
		
	{
		if(j>i)
		{
			System.out.print(" ");
		}
		else
		{
			System.out.print(" *");
		}
		
	}
	System.out.println();
}



System.out.println("triangle in another way");
for(int i=1;i<=4;i++)
{
	for(int j=4;j>=i;j--)
	{
		System.out.print("  ");
		
	}
	for(int k=1;k<(i*2);k++)
	{
		System.out.print("* ");
	}
	System.out.println();
}


System.out.println("inverse triangle");
for(int i=1;i<=4;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("  ");
	}
	for(int k=7;k>=(i*2)-1;k--)
	{
		System.out.print("* ");
		
	}
	System.out.println();
}
System.out.println("diomond pattern");

for(int i=1;i<=4;i++)
{
	for(int j=4;j>=i;j--)
	{
		System.out.print("  ");
		
	}
	for(int k=1;k<(2*i);k++)
	{
		System.out.print("* ");
	}
	System.out.println();
}
for(int i=1;i<=3;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print("  ");
	}
	for(int k=5;k>=(2*i)-1;k--)
	{
		System.out.print("* ");
	}
	System.out.println();
}
System.out.println("slanted line");
for(int i=1;i<=4;i++)
{
	for(int j=1;j<=4;j++)
	{
		if(i==j)
		{
			System.out.print("* ");
		}
		else
		{
			System.out.print("  ");
		}
		
	}
	System.out.println();
}
System.out.println("oft to right slanted line");
for(int i=1;i<=4;i++)
{
	for(int j=4;j>i;j--)
	{
		System.out.print("  ");
	}
	for(int k=1;k<=i;k++)
		
	{
		if(k==i)
		System.out.print("* ");
	}
		System.out.println();
}
System.out.println("hi");
	}

}
