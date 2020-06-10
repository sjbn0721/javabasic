package test;
import java.util.Scanner;

public class PersonApp{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person[] persons = new Person[5];
		for(int i=0;i<=4;i++) {
			Person person = new Person();
			System.out.println("이름은 무엇인가요?");
			person.name = scanner.next();
			System.out.println("키는 어떻게 되나요?");
			person.height = scanner.nextFloat();
			System.out.println("나이는 어떻게 되나요?");
			person.age = scanner.nextInt();
			persons[i]=person;
		}
		for(int i=0;i<=4;i++) {
			persons[i].printStates();
		}
	}
}