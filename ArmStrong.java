package week1.day1;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int calculate=0, reminder, original;
		original=num;
		while(num>0) {
			reminder=num%10;
			num=num/10;
			calculate+=reminder*reminder*reminder;}
			if(calculate==original) {
				System.out.println("Its a Armstrong number");
			}
			else {
				System.out.println("Not a Armstrong number");
			}
		

	}

}
