import java.util.Scanner;

/*
 * Triangle Calculator
 * Srikant Kumar Kalaputapu
 * June 19, 2017
 */

public class TriangleCalculator {
	
	public static void main(String[] args){
		
		int s1,s2,s3;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello, Welcome to the Triangle Calculator");
		System.out.println("Enter side 1:");
		s1=keyboard.nextInt();
		System.out.println("Enter side 2:");
		s2=keyboard.nextInt();
		System.out.println("Enter side 3:");
		s3=keyboard.nextInt();
		
		if(isEquilateral(s1,s2,s3)){
			System.out.println("The triangle is an equilateral triangle.");
		}
		else if(isRight(s1,s2,s3)){
			System.out.println("The triangle is a right triangle.");
		}
		else{
			System.out.println("The triangle is neither an equilateral triangle nor a right triangle.");
		}
		
	}
	/** Determines if a triangle is an equilateral triangle based on side length
	 * @param side1 side of a triangle
	 * @param side2 side of a triangle
	 * @param side3 side of a triangle
	 * @return true or false if an equilateral triangle
	 */
	public static boolean isEquilateral(int side1, int side2, int side3){
		
		return (side1==side2&&side2==side3);
	}
	

	/**
	 * Determines if a triangle is a right triangle based on the Pythagorean theorem.
	 * @param side1 side of a triangle
	 * @param side2 side of a triangle
	 * @param side3 side of a triangle
	 * @return true or false if the triangle is a right triangle based on the Pythagorean theorem
	 */
	public static boolean isRight(int side1, int side2, int side3){
		
		int s1 = (int)Math.pow((double)side1, 2.0);

		int s2 = (int)Math.pow((double)side2, 2.0);

		int s3 = (int)Math.pow((double)side3, 2.0);
		
		return ((s1 == (s2+s3)) || (s2 == (s1+s3)) || (s3 == (s2+s1))); 
	}
	
	
	

}
