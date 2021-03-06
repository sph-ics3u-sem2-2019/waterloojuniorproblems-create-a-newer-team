import java.util.Scanner;
public class ShiftySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE+Integer.MIN_VALUE);
		System.out.println("Enter starting number: ");
		double N=in.nextInt();
		System.out.println("Enter number of shifts: ");
		double k=in.nextInt();
		int answer=0;
		while( k>=0) {
			double pow=Math.pow(10 ,  k);
			answer =(int)(N*pow +answer);
			k=k-1;
		}
		System.out.println("Answer:" +answer); 

		/*
		 * Follow the instructions in Junior Problem 2.pdf.
		 * Use the following data to test your program and record your answers
		 * 1) 1,0
		 * 2) 1,3
		 * 3) 99,4
		 * 4) 10000,5
		 * 5) 9139,4
		 * 6) 9252,5
		 * 7) 888,0
		 * 8) 4578,1
		 * 9) 2746,2
		 * 10) 6295,3
		 * 11) 6884,4
		 * 12) 1198,5
		 * 13) 8655,0
		 * 14) 2503,1
		 * 15) 7868,2
		 */
	}

}
