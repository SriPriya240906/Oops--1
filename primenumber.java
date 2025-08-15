package project;
import java.util.Scanner;
public class primenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		int i;
		int sqrt=(int) Math.sqrt(a);
		sc.close();
		if (a<=1) {
			System.out.println( a+ "integer is not a prime");
			return;
		}
		for (i=2;i<=sqrt;i++) {
			if (a%i==0) {
				System.out.println(a+"is not a prime");
				return;
			}
		}
		
	            System.out.println(a + " is prime.");
	        
	}

}

