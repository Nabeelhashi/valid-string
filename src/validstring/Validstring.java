package validstring;
class Valid
{
	String a="egh";
	String b="yu";
	String c="eghyu";
	void CheckValid()
	{
		String d= a.concat(b);
		int n= d.length();
		int h= c.length();
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<h;j++)
			{
				if(c.charAt(j)==d.charAt(i))
				{
					count++;
				}
			}
		}
		if(count>=n)
		{
			System.out.println("The third string is the valid shuffle of the first and the second string");
		}
		else
		{
			System.out.println("It is not a valid shuffle");
		}
	}
}
public class Validstring {
	public static void main(String[] args)
	{
		Valid valid = new Valid();
		valid.CheckValid();
	}
}
