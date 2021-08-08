package week1.day1;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=356;
		int q=1;
		int r=0;
		while(q !=0)
		{
			q=i/10;
			r=i%10 + r;
			i = q;
			
		}
		System.out.println("Sum of digit is " + r);

	}

}
