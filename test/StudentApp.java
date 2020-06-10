package test;
import java.util.Scanner;
public class StudentApp{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[3];
		for(int i=0;i<2;i++) {
			Student student = new Student();
			System.out.println("이름 : ");
			student.setName(scanner.next());
			System.out.println("국어 점수 : ");
			student.setKor(scanner.nextInt());
			System.out.println("영어 점수 : ");
			student.setEng(scanner.nextInt());
			System.out.println("수학 점수 : ");
			student.setMath(scanner.nextInt());
			student.sum();
//			System.out.println(student.avg());
			student.avg();
			students[i]=student;
		}			
		for(int i=0;i<students.length;i++) {
			students[i].printStates();
		}	
	}	
}
