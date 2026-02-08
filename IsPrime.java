package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13;
		boolean isPrime=true;
		 if(number<=1) {
			 isPrime=false;
		}
		else
		{
			for(int i=2; i<number; i++) {
				if (number%i==0) {
					isPrime=false;
					break;
				}
			}
		}
	
		if(isPrime) {
		
System.out.println(number+"Its a Prime number");
		}
		else {
	System.out.println(number+"Its not a Prime number");
	
		}
	

	}
	
}
