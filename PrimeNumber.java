package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, x=0, y=0;
		int n=3;
		x=n/2;
		if(n==0||n==1) {
			System.out.println(n+"is not a prime number");
		}else {
			for(i=2;i<=x;i++) {
				if(n%i==0)
				{System.out.println(n+"is not a prime number");
				y=1;
				break;
				}
			}
			if(y==0) {System.out.println(n+" is a prime number");
		
			}
		}

	}

}
