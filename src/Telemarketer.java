import java.util.Scanner;
public class Telemarketer {

	public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("Enter the first digit of the last four of the phone number: ");
	int x=in.nextInt();
	System.out.println("Enter the second digit of the last four of the phone number: ");
	int y =in.nextInt();
	System.out.println("Enter the third digit of the last four of the phone number: "  );
	int z=in.nextInt();
	System.out.println("Enter the fourth digit of the last four of the phone number: ");
	int q=in.nextInt();
	System.out.println("Number: "  +x + y+ z + q );
	if (x==8||x==9 && q == 8 || q==9 &&  y==z)  { 
	System.out.println("Ignore"); 
	} else System.out.println("Answer"); {

}
	// use while loop { 
	// int answer=iegiohwiog
	// y> 0 
		// TODO Auto-generated method stub
		/*
		 * Follow the instructions in JuniorProblem.pdf
		 * Use the following values to test your program and record your results
		 * 1) 8,6,6,7
		 * 2) 7,6,6,8
		 * 3) 9,5,6,9
		 * 4) 3,4,5,6
		 * 5) 0,8,8,0
		 * 6) 8,5,5,9
		 * 7) 9,1,1,9
		 * 8) 9,9,9,9
		 * 9) 9,1,2,8
		 * 10) 8,7,4,8 
		 * 11) 8,2,2,7
		 * 12) 1,3,3,9
		 * 13) 1,0,2,6
		 */

	}


}

