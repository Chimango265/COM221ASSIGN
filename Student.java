public class Student{
	private String name;
	private double[]grades;
	private static int totalNumberOfStudent = 1;

	public Student(){

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
	public int getNumberOfStudents(){
		return totalNumberOfStudent++;
	}
	public double getAverageGrade(){
		double sum = 0;
		for(int i = 0;i<grades.length;i++){
			sum += grades[i];
		}
		double average = sum/grades.length;
		return average;
	}
	public void printStudentDetails(){
		System.out.println("Student name is :"+this.name+"and average grade is :"+getAverageGrade()+" and current number of students is"+totalNumberOfStudent);
	}
}