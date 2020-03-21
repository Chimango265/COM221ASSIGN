import java.util.Scanner;
public class ImplementStudent{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		Student []student = new Student[2];
		for(int i = 0;i<student.length;i++){
			student[i] = new Student();
		}
		System.out.println("enter your full name");
		String name = input.nextLine();
		System.out.println("enter number of uour grades");
		int numOfGrades = input.nextInt();
		System.out.println("enter the grades");
		double []grades = new double[numOfGrades];
		for(int i = 0;i<grades.length;i++){
			grades[i] = input.nextDouble();
		}
		student[2].setName(name);
		student[2].setGrades(grades);
		student[2].printStudentDetails();

	}
}