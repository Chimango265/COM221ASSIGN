public class Student{
	private String name;
	private double[]grades;
	private static int totalNumberOfStudent = 0;

    //no arg constructor for student object
	public Student(){
		totalNumberOfStudent++;

	}
	public void setName(String name){
		this.name = name;

	}
	public String getName(){
		return this.name;
	}
	public void setGrades(double[]grades){
		this.grades = grades;
	}
	public double[]getGrades(){
		return this.grades;
	}
	//returning the number of objects created
	public static int getNumberOfStudents(){
		return totalNumberOfStudent;
	}
	//average calculations for the grades in the grades array
	public double getAverageGrade(){
		double sum = 0;
		for(int i = 0;i<grades.length;i++){
			sum += grades[i];
		}
		double average = sum/grades.length;
		return average;
	}
	//returning all the details processed
	public void printStudentDetails(){
		System.out.println("Student name is :"+this.name+"and average grade is :"+getAverageGrade()+" and current number of students is"+totalNumberOfStudent);
	}
}
