import java.util.Scanner;
public class ImplementStudent{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		Student []student = new Student[2];//creating an array of objects
		for(int i = 0;i<student.length;i++){
			student[i] = new Student();
		}//the array of objects have been inialised
		System.out.println("enter your full name");
		String name = input.nextLine();
		System.out.println("enter number of uour grades");
		int numOfGrades = input.nextInt();
		System.out.println("enter the grades");
		double []grades = new double[numOfGrades];
		//inputing the value for the grades array
		for(int i = 0;i<grades.length;i++){
			grades[i] = input.nextDouble();
		}
		//calling on methods for the student object with index 0
		student[0].setName(name);
		student[0].setGrades(grades);
		student[0].printStudentDetails();

	}
}
