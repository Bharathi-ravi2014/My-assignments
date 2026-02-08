package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1;
		System.out.println(a+"\n"+b);
		for (int i=1; i<=7; i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
