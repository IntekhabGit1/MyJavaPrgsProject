package ApnaCollegePrac1;

public class Prac_PrimeNo1 {

	public static void main(String[] args) {
		int n=6;
		int count=0;
		if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println("Prime No.");
			}
			else
				System.out.println("Not Prime No.");
		}
		else
		System.out.println("No is either 0 or negative");

	}

}
