import java.util.Scanner;

public class program {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		String ip=sc.next(); 
		char a[][]=new char[ip.length()][ip.length()];
		for(int i=0;i<ip.length();i++)
		{
			for(int j=0;j<ip.length();j++)
			{
				if(i==j)
				{
				a[i][j]=ip.charAt(j);
				}
				else
				{
					a[i][j]=' ';
				}
			}
		}
		int j=ip.length()-1;
		for(int i=0;i<ip.length();i++)
		{
				a[i][j]=ip.charAt(j);
				j--;
		}
		for(int i=0;i<ip.length();i++)
		{
			for(j=0;j<ip.length();j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
