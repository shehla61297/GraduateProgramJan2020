package com.mastek.training.basics;

public class ExampleApplication {
	public static void main(String[] args) {
		int maxResult=0;
		
		maxResult = SolutionProvider.getMaxNumber(10, 2);
		System.out.println("Max Result is " +maxResult);
		
		maxResult = SolutionProvider.getMaxNumber(10, 10);
		System.out.println("Max Result is " +maxResult);
		
		maxResult = SolutionProvider.getMaxNumber(-110, -2);
		System.out.println("Max Result is " +maxResult);
		
		maxResult = SolutionProvider.getMaxNumber(9999999, 2);
		System.out.println("Max Result is " +maxResult);
		
		SolutionProvider.getQuotientAndRemainder(110, 10);
		
		SolutionProvider.getQuotientAndRemainder(556, 9);
		
		SolutionProvider.getDistanceConvertor(160);
		
		SolutionProvider.getAreaOfARectangle(10, 4);
		
		SolutionProvider.getAreaOfASquare(10, 10);
		
		SolutionProvider.getJourneyTime(100, 50);
		
		SolutionProvider.getAreaOfACircle(4);
		
		SolutionProvider.getMultiplicationTable(2);
		
		SolutionProvider.getMinimumValue(10, 4, 5);
		
		SolutionProvider.getTestResults(55, 40, 69);
		
		SolutionProvider.getSubjectMarks(55, 67, 87);
	}}
		


		



	
	