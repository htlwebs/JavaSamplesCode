package Week1;

import java.util.Scanner;

public class Maxof3 {

	public static void main(String[] args) {
	int a,b,c;
	Scanner ss= new Scanner(System.in);
	a=ss.nextInt();
	b=ss.nextInt();
	c=ss.nextInt();
	if(a>b)
	{
		if(a>c)
		{
			System.out.println("A is max");
		}
		else
		{
			System.out.println("C is max");	
		}
	}
	else
	{
		
		
		if(b>c)
		{
			System.out.println("B is max");
		}	
		else
		
			{
				System.out.println("c is max");
			}
		
	}
	}

}
