package week1.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1221;
		int Original= number;
		int reverse = 0;
		while(number<1221)
		{
			int rem =number%10;
			reverse=reverse*10+rem;
			number= number/10;
		}
		
		if(Original==reverse) {
			System.out.println(Original+"Its a Palindrome number");
		}
		else {
			System.out.println(Original+"Its not a Palindrome number");
		}
		
	}

}
