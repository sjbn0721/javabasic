package test;
import java.util.Scanner;

public class PersonApp{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person[] persons = new Person[5];
		for(int i=0;i<=4;i++) {
			Person person = new Person();
			System.out.println("�̸��� �����ΰ���?");
			person.name = scanner.next();
			System.out.println("Ű�� ��� �ǳ���?");
			person.height = scanner.nextFloat();
			System.out.println("���̴� ��� �ǳ���?");
			person.age = scanner.nextInt();
			persons[i]=person;
		}
		for(int i=0;i<=4;i++) {
			persons[i].printStates();
		}
	}
}