package keltron.sms;
import keltron.util.*;
import java.io.Serializable;
public class Student implements Serializable,StudentIO{
	private int registerNumber;
	private String studentName;
	private int marks[] = new int[3];
	private String result;
	private int total;
	private double average;

	static  int PASS_MARK;

	// static block 
	// will be invoked before creating the first object

	static{
		PASS_MARK = 50;
	}

	// non parametric constructor
	public Student(){
		
	}

	// parametric constructor
	// constructor overloading

	public Student(int registerNumber,String studentName,int marks[]){
		this.registerNumber = registerNumber;
		this.studentName = studentName;
		this.marks = marks;	
	}

   // setter and getter functions
   // data encapsulation 

   public int getRegisterNumber(){
   		return this.registerNumber;
   }

   public int[] getMarks(){

		return this.marks;
	}
	public void setRegisterNumber(int[] marks){

		this.marks = marks;
	}

	public String getResult(){

		result = "PASS";

		for(int i=0; i<marks.length; i++){
			if(marks[i] < PASS_MARK ){
				result = "FAIL";
			}	
		}

		return this.result;
	}

	public int getTotal(){

	
		for(int i = 0; i<marks.length; i++){
			total += marks[i];
		}

		return this.total;
		
	}
	// function to find the average mark
	public double getAverage(){
		average = Helper.getArrayAverage(marks);
		return average;
	}

	// function to read the student details from console

	public void readStudent(){

		System.out.print("Enter the Register Number :");
		registerNumber = Helper.getI();
		System.out.print("Enter the Name :");
		studentName = Helper.getS();
		for(int i=0;i<marks.length;i++){
			System.out.println("Enter Subject " + (i+1) + " mark :");
			marks[i] = Helper.getMark();
		}
		
	}

	
	public void findResult(){

		result = "PASS";
		total = 0;
		for(int i=0;i<marks.length;i++){
			if(marks[i] < PASS_MARK ){
				result = "FAIL";

			}	
			total += marks[i];
			//total = total + marks[i];
		}
		average = Helper.getArrayAverage(marks);
	}

	// function to display the student details in the console
	
	public void displayStudent(){
		this.findResult();

		System.out.println("Register Number :" + this.registerNumber);
		System.out.println("Student Name :" + this.studentName);

		for(int i=0;i<marks.length;i++){
			System.out.println("Subject " + (i+1) + " mark :" + marks[i]);	
		}

		System.out.println("Total :" + total);
		System.out.println("Result :" + result);
		System.out.println("Average :" + average);
		System.out.println("PASS_MARK :" + PASS_MARK);
		System.out.println("***********************************");

	}


}