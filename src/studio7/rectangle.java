package studio7;

import java.util.Scanner;

public class rectangle {
	
	private double width;
	private double length;
	
	
	public rectangle(double width1, double length1) {
		width=width1;
		length=length1;
		
		
	}
	
	public static double getArea(double width, double length) {
		double area=width*length;
		return area;
	}
	
	public static double getPerimeter(double width, double length) {
		double perimeter=(width+length)*2;
		return perimeter;
	}
	public static boolean isSquare(double width, double length) {
		boolean square=false;
		if (width==length) {
			square=true;
		}
		return square;
	}	
	
	public static String compare(rectangle rec1, rectangle rec2) {
		double rect1Area= getArea(rec1.length, rec1.width);
		double rect2Area=getArea(rec2.length, rec2.width);
		if(rect1Area>rect2Area) {
			return "rectangle 1 is bigger than rectangle 2.";
		}else if(rect1Area==rect2Area) {
			return "rectangle 1 is equal to rectangle 2.";
		}else {
			return "rectangle 2 is bigger than rectangle 1.";
		}
	}
	
	public static void main(String[] args) {
		rectangle rec1=new rectangle(1,2);
		rectangle rec2=new rectangle(4,4);
		
		System.out.println(compare(rec1,rec2));
		System.out.println(isSquare(rec1.width,rec1.length));
		
		
		
		
		
	}

}
