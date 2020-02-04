package com.mastek.training.basics;

public class SolutionProvider {
/* 
 * Take two numbers from the user and display the maximum number as output
 * 
 *
 */
	//public static <return-datatype> <name>(<param_type1>, <param_type2>,...)
	public static int getMaxNumber(int num1,int num2) {
		int max=0; //declare output as local variable 
		if (num1>num2) {// validate the conditions for logical result
			max=num1;
		} else {
			max=num2;
		}
		return max;//return the result to the caller
		
	}

	//Problem 1 
	public static void getQuotientAndRemainder(int dividend, int divisor) {
		int quotient= dividend / divisor;
		int remainder= dividend % divisor;
		System.out.println("The quotient is = " + quotient);
		System.out.println("The remainder is = " + remainder);		
	}
	
//problem 2 

public static void getDistanceConvertor(double kM) {

        double miles = kM / 1.6;

        System.out.println(miles + " Miles");

    }


//problem 3

public static void getAreaOfARectangle(int lenght, int width) {
	int area = lenght * width;
	System.out.println("The area of the rectangle is " + area);
	
}

public static void getAreaOfASquare(int lenght, int width) {
	int area = lenght * width;
	System.out.println("The area of the square is " + area);
}

//problem 4
public static void getJourneyTime(double distance, double speed) {
	double time = distance / speed;

	System.out.println("The time taken for the journey is " + time + " hours long");
}

//problem 5
public static void getAreaOfACircle(int r) {
	double area = Math.PI * r * r;
	System.out.println("The area of the circle is " + area + " cm");	
}
//problem 6
public static void getMultiplicationTable(int n) {
	int range = 10;
	for (int i = 1; i <= range; ++i) {
		
        System.out.println(n + "*" + i + "=" + n * i);
}

}
//problem 7
public static int getMinimumValue(int num1, int num2, int num3) {
	int MinimumValue = Math.min(num1, num2);
	MinimumValue = Math.min(MinimumValue, num3);
		return MinimumValue;
	
	
}

//problem 8
public static void getTestResults(double mark1, double mark2, double mark3) {
	double averageMark = (mark1 + mark2 + mark3)/3;
if (averageMark >=50);
System.out.println("Pass");
if (averageMark <50) 
System.out.println("Fail");
}


//PROBLEM 9
 public static void getSubjectMarks(double subject1, double subject2, double subject3) {
 double average = (subject1 + subject2 + subject3)/3;
 if (average >=90) {
 System.out.println("A+");
 }
 else if(average >= 80 && average <90) {
 System.out.println("A");
 }
 else if(average >= 70 && average <80 ){
 System.out.println("A-");
 }
 else if(average >= 60 && average <70){
 System.out.println("B+");
 }
 else if (average >= 50 && average <60) {
 System.out.println("B");
 }
 else if(average <50) {
 System.out.println("Fail");
 }
 }}

//problem 10



	
	
			

 
	 
 