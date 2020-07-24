package userInput;
import java.util.Scanner; //Scsnner is a class

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first we make a object of class Scanner
		Scanner sc=new Scanner(System.in); //sc is a object of class scanner
		
		System.out.println("Enter the Principal amount");
		int principal=sc.nextInt();//principal is of type int
		
		System.out.println("Enter the rate of Interest");
		float rate=sc.nextFloat();//rate is of type float
		
		System.out.println("Enter the time duration");
		int time=sc.nextInt();//time is of type int
		
		float simpleInterestresult=(principal*rate*time)/100;
		
		System.out.println("SimpleInterest for userinput is "+simpleInterestresult);

	}

}
